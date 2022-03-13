package com.example.kafkasample01.service;

import com.example.sample01.Application;
import com.example.sample01.infrastructure.dal.mysql.dataobject.UserDO;
import com.example.sample01.service.UserService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest(classes = Application.class)
class UserServiceTest {
    @Autowired
    UserService userService;


    @Test
    @Transactional
    @Rollback(true)
    void testGetById() {

        //插入一条id = 1的user
        UserDO ud = new UserDO();
        ud.setId(1L);
        ud.setDeleted(0);
        ud.setEmail("cc@qq.com");
        ud.setGmtCreate(new Date());
        ud.setGmtModified(new Date());
        ud.setIdCardNo("31018987655554");
        ud.setMobile("13888888888");
        ud.setName("jack");
        ud.setStatus(1);
        ud.setUserName("jackchen");

        userService.createUser(ud);

        //根据id查询
        UserDO userDO = userService.getById(1L);
        Assertions.assertTrue(userDO.getId()==1L);
        System.out.println(userDO.toString());

    }

    @Test
    @Transactional
    @Rollback(true)
    void testGetByIds() {

        //插入一条id = 1的user
        UserDO ud = new UserDO();
        ud.setId(1L);
        ud.setDeleted(0);
        ud.setEmail("cc@qq.com");
        ud.setGmtCreate(new Date());
        ud.setGmtModified(new Date());
        ud.setIdCardNo("31018987655554");
        ud.setMobile("13888888888");
        ud.setName("jack");
        ud.setStatus(1);
        ud.setUserName("jackchen");
        userService.createUser(ud);


        UserDO ud1 = new UserDO();
        ud1.setId(2L);
        ud1.setDeleted(0);
        ud1.setEmail("cc@qq.com");
        ud1.setGmtCreate(new Date());
        ud1.setGmtModified(new Date());
        ud1.setIdCardNo("31018987655554");
        ud1.setMobile("13888888888");
        ud1.setName("jack");
        ud1.setStatus(1);
        ud1.setUserName("jackchen");

        userService.createUser(ud1);


        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        ids.add(2L);

        List<UserDO> userList = userService.listByIds(ids);
        Assertions.assertTrue(userList.size()==2);

        if(userList != null){
            userList.forEach(e->{
                System.out.println(e.toString());
            });
        }
    }

}
