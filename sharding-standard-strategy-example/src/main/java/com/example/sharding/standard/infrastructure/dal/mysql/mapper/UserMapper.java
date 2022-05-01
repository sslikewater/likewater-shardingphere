package com.example.sharding.standard.infrastructure.dal.mysql.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sharding.standard.infrastructure.dal.mysql.dataobject.UserDO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 9:16 下午 2022/3/2
 */
public interface UserMapper extends BaseMapper<UserDO> {
    UserDO findById(@Param("id") Long id);

    List<UserDO> listByIds(@Param("ids") List<Long> ids);


    List<UserDO> listByIdRange(@Param("lower") Long lower, @Param("upper") Long upper);

    List<UserDO> listByIdsGtOrLt( @Param("lower") Long lower,@Param("upper") Long upper);

    List<UserDO> listByIdsGreaterThan(@Param("value") Long value);


    List<UserDO> listByIdsLessThan(@Param("value") Long value);

}
