package com.leihou.service1;

import com.leihou.entity.User;

import java.util.List;

public interface UserService {
     User login(User user);

     User queryById(String id);

     int update(User user);

     List<User> queryAll();

     int createUser(User user);
}
