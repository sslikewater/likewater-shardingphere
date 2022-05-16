package com.example.sharding.complex.service;


import com.example.sharding.complex.ShardingComplexStrategyExampleApplication;
import com.example.sharding.complex.service.dto.OrderCreateDTO;
import com.example.sharding.complex.service.dto.OrderDTO;
import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.common.Status;
import com.sankuai.inf.leaf.service.SegmentService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = ShardingComplexStrategyExampleApplication.class)
class OrderServiceTest {
    @Autowired
    OrderService orderService;

    @Autowired
    private  SegmentService segmentService;


    @Test
    @Transactional
    @Rollback(true)
    void testPlaceOrder() {
        OrderCreateDTO dto = new OrderCreateDTO();
        dto.setUserId(10001L);//后四位为分片位
        dto.setDeliveryAmount(1000L);
        dto.setSellerId(10001L);
        dto.setStoreId(10001L);
        dto.setTotalAmount(10000L);
        dto.setTotalItemsAmount(10000L);
        dto.setDeliveryAddress("深圳");


        long id = orderService.placeOrder(dto);

        //根据id查询
        OrderDTO orderDO = orderService.getOrder(id);
        Assertions.assertTrue(orderDO.getId()==id);
        System.out.println(orderDO.toString());

    }


    @Test
    @Transactional
    @Rollback(true)
    void testGetOrder() {

       long id = 100000L;
        //根据id查询
        OrderDTO orderDO = orderService.getOrder(id);
//        Assertions.assertTrue(orderDO.getId()==id);
//        System.out.println(orderDO.toString());

    }

    @Test
    void testSegment(){
        for(int i=0;i<10;i++) {
            Result res = segmentService.getId("t_order");
            if(res.getStatus().equals(Status.SUCCESS)) {
                System.out.println("distri id:" +res.getId());
            }
        }
    }


}
