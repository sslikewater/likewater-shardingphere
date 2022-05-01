package com.example.sharding.standard.infrastructure.config;

import com.google.common.collect.Range;

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
public class UserRangeAlgorithmForTable implements RangeShardingAlgorithm<Long> {
    @Override
    /**
     * Sharding.
     *
     * @param availableTargetNames 数据源或者表列表
     * @param shardingValueRange  分片键的范围值
     * @return sharding results for data sources or tables's names
     * 例子：
     */
    public Collection<String> doSharding(final Collection<String> databaseNames, final RangeShardingValue<Long> shardingValueRange) {
        Set<String> result = new LinkedHashSet<>();

        long minValue = shardingValueRange.getValueRange().hasLowerBound() ? shardingValueRange.getValueRange().lowerEndpoint() : Long.MIN_VALUE;
        long maxValue = shardingValueRange.getValueRange().hasUpperBound() ? shardingValueRange.getValueRange().upperEndpoint() : Long.MAX_VALUE;

        System.out.println("minValue = " + minValue + " maxValue=" + maxValue);

//        long minValue = shardingValueRange.getValueRange().lowerEndpoint();
//        long maxValue = shardingValueRange.getValueRange().upperEndpoint();

        //
        /**
         * [0,10)  user_0
         * [10,20)  user_1
         * [30,40)  user_2
         * [40,+∞)  user_3
         */

        if (Range.openClosed(Long.MIN_VALUE, 10L).encloses(shardingValueRange.getValueRange())) {
            result.add("user_0");

        } else if (Range.openClosed(10L, 20L).encloses(shardingValueRange.getValueRange())) {
            result.add("user_1");

        } else if (Range.openClosed(20L, 30L).encloses(shardingValueRange.getValueRange())) {
            result.add("user_2");

        } else if (Range.openClosed(40L, Long.MAX_VALUE).encloses(shardingValueRange.getValueRange())) {
            result.add("user_3");
        } else {
            result.addAll(databaseNames);
        }

        return result;
    }
}
