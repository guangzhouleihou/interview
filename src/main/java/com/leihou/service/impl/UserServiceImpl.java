package com.leihou.service.impl;

import com.leihou.entity.User;
import com.leihou.service1.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Override
    public User login(User user) {
        return null;
    }

    @Override
    public User queryById(String id) {
        return null;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public List<User> queryAll() {
        return null;
    }

    @Override
    public int createUser(User user) {
        return 0;
    }
}
