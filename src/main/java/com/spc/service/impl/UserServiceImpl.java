package com.spc.service.impl;

import com.spc.entity.User;
import com.spc.mapper.UserMapper;
import com.spc.service.UserService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User login(String username, String password){
        return userMapper.login(username,password);
    }
}
