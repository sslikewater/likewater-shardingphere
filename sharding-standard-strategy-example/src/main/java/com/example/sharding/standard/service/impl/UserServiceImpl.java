package com.example.sharding.standard.service.impl;



import com.example.sharding.standard.infrastructure.dal.mysql.dataobject.UserDO;
import com.example.sharding.standard.infrastructure.dal.mysql.mapper.UserMapper;
import com.example.sharding.standard.service.UserService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 5:17 上午 2022/3/2
 */
@Service
public  class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserDO getById(Long id) {
        UserDO userDO =  userMapper.findById(id);

        return userDO;
    }

    @Override
    public List<UserDO> listByIds(List<Long> ids) {
        return userMapper.listByIds(ids);
    }

    @Override
    public int createUser(UserDO userDO) {
        return userMapper.insert(userDO);
    }

    @Override
    public List<UserDO> listByIdRange(Long lower,Long upper) {
        return userMapper.listByIdRange(lower,upper);
    }

    @Override
    public List<UserDO> listByIdsGtOrLt(Long lower, Long upper) {
        return userMapper.listByIdsGtOrLt(lower,upper);
    }

    @Override
    public List<UserDO> listByIdsGreaterThan(Long value) {
        return userMapper.listByIdsGreaterThan(value);
    }

    @Override
    public List<UserDO> listByIdsLessThan(Long value) {
        return userMapper.listByIdsLessThan(value);
    }




}
