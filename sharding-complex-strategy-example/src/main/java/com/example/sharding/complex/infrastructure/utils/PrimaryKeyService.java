package com.example.sharding.complex.infrastructure.utils;

import com.example.sharding.complex.infrastructure.exception.LeafSegmentException;
import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.common.Status;
import com.sankuai.inf.leaf.service.SegmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 5:34 下午 2022/5/2
 */
@Service
public  class PrimaryKeyService {
    @Autowired
    private SegmentService segmentService;


    /**
     * 调用美团号段生成分布式ID+四位随机分片位，适合买家ID，或者卖家ID生成
     * @return
     */
     public long get(String bizTag) {
         long distributeId;
         Result res = segmentService.getId(bizTag); //从美团的号段获取
         if(res.getStatus().equals(Status.SUCCESS)){
              distributeId = res.getId();
         }
         else {
             throw new LeafSegmentException(res.toString());
         }

         //生成四位随机分片位
        Random r = new Random();
        long slice = r.nextInt(9999);
        distributeId = distributeId * 10000;
        long id = distributeId + slice;
        return id;
    }

    /**
     * 根据传入的分片位，生成主键ID
     * @param slice  分片位
     * @return
     */
     public long get(String bizTag,long slice) {
         Result res = segmentService.getId(bizTag); //从美团的号段获取
         if(res.getStatus().equals(Status.SUCCESS)){
             long distributeId = res.getId();

             System.out.println("distributeId="+distributeId);

             distributeId = distributeId * 10000;
             return distributeId + slice;
         }
         else {
             throw new LeafSegmentException(res.toString());
         }



    }
}