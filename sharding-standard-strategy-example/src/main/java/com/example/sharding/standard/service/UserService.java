package com.example.sharding.standard.service;


import com.example.sharding.standard.infrastructure.dal.mysql.dataobject.UserDO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 5:17 上午 2022/3/2
 */
public interface UserService {
    UserDO getById(Long id);

    List<UserDO> listByIds(List<Long> id);

    int createUser(UserDO userDO);


    List<UserDO> listByIdRange(Long lower,Long upper);

    List<UserDO> listByIdsGtOrLt(Long lower,Long upper);

    List<UserDO> listByIdsGreaterThan( Long value);

    List<UserDO> listByIdsLessThan(Long value);

}
