package com.leihou.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leihou.interview.pojo.User;
import com.leihou.interview.service.UserService;
import com.leihou.interview.vo.Result;

@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("hello")
	public String hello() {
		return "<h1>hello world</h1>";
	}
	//登录接⼝
	@RequestMapping("accountcontroller/login")
	public Result doLogin(User user) {
		try {
			userService.login(user);
			return Result.ok();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Result.build(201, "登陆失败");
	}
	//创建⽤用户
	@RequestMapping("hm-usercontroller/createHmUser")
	public Result doSaveUser(User user) {
		try {
			userService.saveUser(user);
			return Result.ok();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Result.build(201, "注册失败");
	}
	//更新用户：http://localhost:8080/swagger-ui.html#!/hm-usercontroller/getHmUser PUT方式
	@RequestMapping("hm-usercontroller/getHmUser")
	public Result doUpdateUser(User user) {
		try {
			userService.updateUser(user);
			return Result.ok();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Result.build(201, "用户信息更新失败");
	}
	//查询某个用户信息：http://localhost:8080/swagger-ui.html#!/hm-usercontroller/getHmUser GET方式
	@RequestMapping("hm-usercontroller/getHmUser/{id}")
	public Result dofindUser(@PathVariable()String id) {
		try {
			User user=userService.findUser(id);
			return Result.okObj(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Result.build(201, "用户查找失败");
	}
}
