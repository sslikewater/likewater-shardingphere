package com.example.sample01.service;

import com.example.sample01.infrastructure.dal.mysql.dataobject.UserDO;

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

}
