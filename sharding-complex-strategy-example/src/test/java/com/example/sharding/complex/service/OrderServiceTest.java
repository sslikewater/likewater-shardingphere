package com.example.sharding.complex.service;


import com.example.sharding.complex.ShardingComplexStrategyExampleApplication;
import com.example.sharding.complex.service.dto.OrderCreateDTO;
import com.example.sharding.complex.service.dto.OrderDTO;

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


    @Test
    @Transactional
    @Rollback(true)
    void testPlaceOrder() {

        //插入一条id = 1的user
        OrderCreateDTO dto = new OrderCreateDTO();
        dto.setUserId(1L);
        dto.setDeliveryAmount(1000L);
        dto.setSellerId(1L);
        dto.setStoreId(1L);
        dto.setTotalAmount(10000L);
        dto.setTotalItemsAmount(10000L);



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



}
