package com.example.sharding.complex.infrastructure.utils;

import java.util.Random;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 5:34 下午 2022/5/2
 */
public  class PrimaryKeyUtil {
    /**
     * 调用美团号段生成分布式ID+四位随机分片位
     * @return
     */
    static public long get() {
        long distributeId = 1; //从美团的号段获取

        Random r = new Random();
        long slice = r.nextInt(9999);
        distributeId = distributeId * 10000;
        long id = distributeId + slice;
        return id;
    }

    /**
     *
     * @param slice  分片位
     * @return
     */
    static public long get(long slice) {
        long distributeId = 1; //从美团的号段获取


        distributeId = distributeId * 10000;
        return distributeId + slice;
    }
}