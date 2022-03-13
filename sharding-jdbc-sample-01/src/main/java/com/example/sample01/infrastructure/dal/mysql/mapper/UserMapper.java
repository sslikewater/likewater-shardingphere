package com.example.sample01.infrastructure.dal.mysql.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sample01.infrastructure.dal.mysql.dataobject.UserDO;

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


}
