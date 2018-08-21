package com.leihou.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leihou.interview.pojo.AuthToken;
import com.leihou.interview.service.UserService;

@RestController("/user")
public class UserController {
	@Autowired
	private UserService userService;

	/**
	 * 登陆
	 * 
	 * @param name
	 * @param password
	 * @return
	 */
	@PostMapping("/login")
	public AuthToken login(String name, String password) {

		AuthToken login = userService.login(name, password);

		return login;

	}
/**
 * 注册
 * @param name
 * @param password
 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public void register(String name, String password) {
		userService.register(name, password);

	}



/**
 * xiugai 
 * @param name
 * @param password
 */
	@RequestMapping(value = "/change", method = RequestMethod.POST)
	public void change(String name, String password) {
		
		userService.change(name, password);
	}

}
