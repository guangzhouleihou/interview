package com.leihou.interview.service;

import com.leihou.interview.pojo.User;

public interface UserService {

	User login(User user);

	int saveUser(User user);

	int updateUser(User user);

	User findUser(String id);

}
