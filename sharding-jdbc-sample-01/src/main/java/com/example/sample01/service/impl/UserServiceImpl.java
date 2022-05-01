package com.example.sample01.service.impl;


import com.example.sample01.infrastructure.dal.mysql.dataobject.UserDO;
import com.example.sample01.infrastructure.dal.mysql.mapper.UserMapper;
import com.example.sample01.service.UserService;
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
    public List<UserDO> listByIdRange(Long start, Long end) {
        return userMapper.listByIdRange(start,end);
    }
}
