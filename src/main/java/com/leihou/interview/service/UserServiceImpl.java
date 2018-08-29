package com.leihou.interview.service;

import java.util.UUID;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leihou.interview.mapper.UserMapper;
import com.leihou.interview.pojo.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Override
	public User login(User user) {
		if(user.getLoginid()==null||user.getLoginid()=="") {
			throw new RuntimeException("用户账号不能为空");
		}
		User result=userMapper.getOneByUser(user);
		if(result==null) {
			throw new RuntimeException("用户或帐号密码不正确");
		}
		return result;
	}
	@Override
	public int saveUser(User user) {
		if(user.getLoginid()==null||user.getLoginid()=="") {
			throw new RuntimeException("用户账号不能为空");
		}
		int result=userMapper.insert(user);
		return result;
	}
	@Override
	public int updateUser(User user) {
		if(user.getLoginid()==null||user.getLoginid()=="") {
			throw new RuntimeException("用户账号不能为空");
		}
		int result=userMapper.update(user);
		return result;
	}
	@Override
	public User findUser(String id) {
		User result=userMapper.getOne(id);
		return result;
	}

}
