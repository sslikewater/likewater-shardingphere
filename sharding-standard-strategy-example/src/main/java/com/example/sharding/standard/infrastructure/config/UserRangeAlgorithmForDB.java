package com.example.sharding.standard.infrastructure.config;

import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 10:10 上午 2022/5/1
 */
public class UserRangeAlgorithmForDB implements RangeShardingAlgorithm<Long> {
    @Override
    /**
     * Sharding.
     *
     * @param availableTargetNames 数据源或者表列表
     * @param shardingValueRange  分片键的范围值
     * @return sharding results for data sources or tables's names
     */
    public Collection<String> doSharding(final Collection<String> availableTargetNames, final RangeShardingValue<Long> shardingValueRange) {
       //分库的算法是 %2，当出现range查询的时候，无法判断应该路由到哪个库，返回所有的库

        return availableTargetNames;
    }
}
