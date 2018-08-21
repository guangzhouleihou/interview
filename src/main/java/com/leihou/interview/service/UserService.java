package com.leihou.interview.service;

import com.leihou.interview.pojo.AuthToken;
import com.leihou.interview.pojo.Role;

public interface UserService {
	
public AuthToken login(String name,String token);
public AuthToken register(String name,String token);
public AuthToken change(String name,String token);
}
