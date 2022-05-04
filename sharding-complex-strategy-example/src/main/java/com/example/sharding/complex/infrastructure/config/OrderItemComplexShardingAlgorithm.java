package com.example.sharding.complex.infrastructure.config;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;

import com.example.sharding.complex.infrastructure.exception.ShardingSliceNotSupportException;

import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 9:37 上午 2022/3/13
 */
public class OrderItemComplexShardingAlgorithm implements ComplexKeysShardingAlgorithm {
    //分片位的位数
    public static int SPLICE_SIZE = 4;
    final Splitter splitter = Splitter.on(",").trimResults().omitEmptyStrings();

    //该表支持的分片键
    public static final Set<String> shardingSliceKeys = new ImmutableSet.Builder<String>() .add("id").add("user_id").add("order_id") .build();

    /**
     * Sharding.
     *
     * @param collection               availableTargetNames available data sources or table names
     * @param complexKeysShardingValue shardingValue sharding value
     * @return sharding results for data sources or table names。返回最终路由的物理库名（分库）或者表名（分表）
     */
    @Override
    public Collection doSharding(Collection collection, ComplexKeysShardingValue complexKeysShardingValue) {

        //如果是range  查询，直接返回（全库扫码）
        if (!complexKeysShardingValue.getColumnNameAndRangeValuesMap().isEmpty()) {
            return collection;
        }

        //取库的列表（分库） 或者表的列表（分表）
        List<String> availableTargetNamesStr = (List<String>) collection.stream().map(item -> {
            return String.valueOf(item);
        }).collect(Collectors.toList());
        int actualDataNodesSize = availableTargetNamesStr.size();

        List<String> targets = new ArrayList<>();

        //columnName -> List<column value>      where字句存在多个字段条件组合
        Map<String, Collection> columnNameAndShardingValuesMap = complexKeysShardingValue.getColumnNameAndShardingValuesMap();

        //从columnNameAndShardingValuesMap  截取ShardingValues

        columnNameAndShardingValuesMap.forEach((k, v) -> {
            String columnName = k;
            Collection valueCollection = v;

            //如果分片键，才会做路由判断
            if(shardingSliceKeys.contains(k)) {

                v.stream().forEach(obj -> {
                    String strShardingValue = obj.toString();
                    //获取分片位
                    String slicePosition = getShardingSlicePosition(strShardingValue);
                    int index = Integer.valueOf(slicePosition) % actualDataNodesSize;
                    targets.add(availableTargetNamesStr.get(index));
                });
            }

        });

        //去重
        List<String> distinctTargets = targets.stream().distinct().collect(Collectors.toList());


        //返回物理库列表/物理表列表
        if(distinctTargets.size() > 0) {
            return distinctTargets;
        }else {//如果没有命中任何一个分片键，要全库扫描
            return collection;
        }
    }

    //获取分片位（分片位为分片键的最后4位）
    private String getShardingSlicePosition(String key) {
        if (key.length() < SPLICE_SIZE) {//
            throw new ShardingSliceNotSupportException("key length less than 4,not support sharding slice");
        }
        return key.substring(key.length() - 4);
    }
}
