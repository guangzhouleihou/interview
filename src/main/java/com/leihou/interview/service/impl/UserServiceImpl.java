package com.leihou.interview.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.leihou.interview.dao.AuthTokenMapper;
import com.leihou.interview.pojo.AuthToken;
import com.leihou.interview.pojo.Role;
import com.leihou.interview.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private AuthTokenMapper authTokenMapper;

	public AuthToken login(String name, String token) {
		// TODO Auto-generated method stub
		AuthToken selectToken = authTokenMapper.selectToken(name, token);
		return selectToken;
	}
/**
 * 注册
 */
	@Override
	public AuthToken register(String name, String token) {
		AuthToken record=new AuthToken();
		record.setUser_id(name);
		record.setToken(token);
		authTokenMapper.insertSelective(record);
		return null;
	}
@Override
/**
 * 更改
 */
public AuthToken change(String name, String token) {
	AuthToken selectToken = authTokenMapper.selectToken(name, token);
	if (selectToken!=null) {
		selectToken.setToken(token);
		selectToken.setUser_id(name);
		authTokenMapper.updateByPrimaryKeySelective(selectToken);
		return authTokenMapper.selectToken(name, token);
	}
	
	return null;
}

}
