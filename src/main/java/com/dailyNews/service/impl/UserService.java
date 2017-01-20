package com.dailyNews.service.impl;


import com.dailyNews.dao.UserMapper;
import com.dailyNews.model.User;
import com.dailyNews.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by zhouqj on 2017/1/19.
 */
@Service
public class UserService implements IUserService{
    @Resource
    private UserMapper userMapper;

    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    //    @Override
//    public User getUserById(int userId) {
//        return this.userMapper.selectByPrimaryKey(userId);
//    }
}
