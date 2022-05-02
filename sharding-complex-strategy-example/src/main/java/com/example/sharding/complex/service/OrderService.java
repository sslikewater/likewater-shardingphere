package com.example.sharding.complex.service;


import com.example.sharding.complex.service.dto.OrderCreateDTO;
import com.example.sharding.complex.service.dto.OrderDTO;

import java.util.List;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 5:17 上午 2022/3/2
 */
public interface OrderService {
    OrderDTO getOrder(Long id);

    List<OrderDTO> getOrders(Long userId);

    long placeOrder(OrderCreateDTO userDO);


}
