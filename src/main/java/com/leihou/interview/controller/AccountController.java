package com.leihou.interview.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leihou.interview.entity.HmUser;
import com.leihou.interview.entity.HmUserExample;
import com.leihou.interview.mapper.HmUserMapper;
import com.leihou.interview.util.Params;
import com.leihou.interview.vo.JsonResult;

@Controller
@ResponseBody
@RequestMapping("/accountController")
public class AccountController {

	@Resource
	HmUserMapper hmUserMapper;

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ResponseEntity<JsonResult> userLogin(HttpServletRequest request) {
		JsonResult result = new JsonResult();
		try {
			HmUserExample example = new HmUserExample();
			example.createCriteria().andLoginidEqualTo("").andPasswordEqualTo("");
			List<HmUser> userResult = hmUserMapper.selectByExample(example);
			if (userResult.isEmpty()) {
				result.setStatus(Params.ERROR);
			} else {
				result.setStatus(Params.SUCCESS);
				result.setResult(userResult.get(0));
			}
		} catch (Exception e) {
			result.setStatus(Params.ERROR);
			result.setResult(e.getMessage());
			e.printStackTrace();
		}

		return ResponseEntity.ok(result);
	}
}
