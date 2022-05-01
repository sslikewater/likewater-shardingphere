package com.example.sharding.standard.infrastructure.config;

import com.google.common.collect.Range;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 10:02 上午 2022/5/1
 */
public class UserPreciseAlgorithmForTable implements PreciseShardingAlgorithm<Long> {
    @Override


    /**
     * Sharding.
     *
     * @param availableTargetNames available data sources or tables's names
     * @param shardingValue sharding value
     * @return sharding result for data source or table's name
     * 如果执行如果 select *from tb where id in(1,2,3)，doSharding将被触发3次，第一次调用
     * shardingValue的值是1，第二次shardingValue的值是2，第三次调用shardingValue的值是3
     */
    public String doSharding(final Collection<String> availableTargetNames, final PreciseShardingValue<Long> shardingValue) {

        Long value = shardingValue.getValue();

        if (Range.openClosed(Long.MIN_VALUE, 10L).contains(value)) {
            return "user_0";

        } else if (Range.openClosed(10L, 20L).contains(value)) {
            return "user_1";

        } else if (Range.openClosed(20L, 30L).contains(value)) {
            return "user_2";

        } else if (Range.openClosed(40L, Long.MAX_VALUE).contains(value)) {
            return "user_3";
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
