package com.example.sharding.complex.infrastructure.dal.mysql.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.example.sharding.complex.infrastructure.dal.mysql.dataobject.OrderDO;
import com.example.sharding.complex.infrastructure.dal.mysql.dataobject.OrderItemDO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 9:16 下午 2022/3/2
 */
public interface OrderItemMapper extends BaseMapper<OrderItemDO> {

    OrderItemDO findById(@Param("id") Long id);

    List<OrderItemDO> getByUserId(@Param("userId") Long userId);

}
