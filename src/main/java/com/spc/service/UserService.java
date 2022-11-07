package com.spc.service;

import com.spc.entity.User;

public interface UserService {
    public User login(String username, String password);
}
