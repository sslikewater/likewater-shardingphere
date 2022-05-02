package com.example.sharding.complex.service.convert;

import com.example.sharding.complex.infrastructure.dal.mysql.dataobject.OrderDO;
import com.example.sharding.complex.service.dto.OrderDTO;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 1:00 下午 2022/3/13
 */
public class OrderConvertor {

    //同名的属性用spring utils，不同名的手工转化
    public static OrderDO dto2do(OrderDTO orderDTO) {
        if (orderDTO == null) return null;

        OrderDO userDO = new OrderDO();
        BeanUtils.copyProperties(orderDTO, userDO);

        //默认不删除记录
        userDO.setDeleted(0);

        return userDO;
    }

    public static OrderDTO do2DTO(OrderDO orderDO) {
        if (orderDO == null) return null;

        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderDO, orderDTO);

        return orderDTO;
    }

    public static List<OrderDTO> doList2DTOList(List<OrderDO> userDOList) {
        if(userDOList == null) return null;

        List<OrderDTO> userDTOList = new ArrayList<>();
        userDOList.forEach(e -> {
            userDTOList.add(do2DTO(e));
        });

        return userDTOList;
    }
}