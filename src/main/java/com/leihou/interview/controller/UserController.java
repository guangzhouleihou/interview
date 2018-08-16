package com.leihou.interview.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leihou.interview.vo.JsonResult;

@Controller
@ResponseBody
@RequestMapping("/hm-userController")
public class UserController {
	
	/**
	 * 创建用户
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "createHmUser", method = RequestMethod.POST)
	public ResponseEntity<JsonResult> createUser(HttpServletRequest request) {
		JsonResult result = new JsonResult();
		
		return ResponseEntity.ok(result);
	}
	
	/**
	 * 更新用户
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "getHmUser", method = RequestMethod.PUT)
	public ResponseEntity<JsonResult> updateUser(HttpServletRequest request) {
		JsonResult result = new JsonResult();
		return ResponseEntity.ok(result);
	}
	
	/**
	 * 查询某个用户信息
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "getHmUser", method = RequestMethod.GET)
	public ResponseEntity<JsonResult> getUser(HttpServletRequest request) {
		JsonResult result = new JsonResult();
		return ResponseEntity.ok(result);
	}
	
	/**
	 * 查询用户列列表
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "getHmUsers", method = RequestMethod.GET)
	public ResponseEntity<JsonResult> getUsers(HttpServletRequest request) {
		JsonResult result = new JsonResult();
		return ResponseEntity.ok(result);
	}
	
}
