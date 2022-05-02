package com.example.sharding.complex.infrastructure.dal.mysql.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sharding.complex.infrastructure.dal.mysql.dataobject.OrderDO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 9:16 下午 2022/3/2
 */
public interface OrderMapper extends BaseMapper<OrderDO> {

    OrderDO findById(@Param("id") Long id);

    List<OrderDO> getByUserId(@Param("userId") Long userId);

}
