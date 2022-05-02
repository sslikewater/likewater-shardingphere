package com.example.sharding.complex.service.impl;


import com.example.sharding.complex.infrastructure.dal.mysql.dataobject.OrderDO;
import com.example.sharding.complex.infrastructure.dal.mysql.mapper.OrderMapper;
import com.example.sharding.complex.infrastructure.utils.PrimaryKeyUtil;
import com.example.sharding.complex.service.OrderService;
import com.example.sharding.complex.service.convert.OrderConvertor;
import com.example.sharding.complex.service.dto.OrderCreateDTO;
import com.example.sharding.complex.service.dto.OrderDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 5:17 上午 2022/3/2
 */
@Service
public  class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;


    @Override
    public OrderDTO getOrder(Long id) {

        return OrderConvertor.do2DTO(orderMapper.findById(id));
    }

    @Override
    public List<OrderDTO> getOrders(Long userId) {
        return OrderConvertor.doList2DTOList(orderMapper.getByUserId(userId));
    }

    @Override
    public long placeOrder(OrderCreateDTO orderDTO) {
        //生成主键id  PrimaryKeyUtil内部调用美团号段生成分布式ID+四位随机分片位
        Long id = PrimaryKeyUtil.get();


        OrderDO orderDO = new OrderDO();
        orderDO.setDeliveryAddressId(orderDTO.getDeliveryAddressId());
        orderDO.setDeliveryAmount(orderDTO.getDeliveryAmount());
        orderDO.setId(id);
        orderDO.setSellerId(orderDTO.getSellerId());
        orderDO.setStoreId(orderDTO.getStoreId());
        orderDO.setTotalAmount(orderDTO.getTotalAmount());
        orderDO.setTotalItemsAmount(orderDTO.getTotalItemsAmount());
        orderDO.setUserId(orderDTO.getUserId());
        orderDO.setGmtCreate(new Date());
        //默认不删除记录
        orderDO.setDeleted(0);
//        int result =  orderMapper.insert(orderDO);
//        if(result == 1){
//            return id;
//        }
//        else {
//            return -1;
//        }

        return 1;

    }
}
