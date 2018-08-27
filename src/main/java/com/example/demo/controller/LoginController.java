package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.common.ResultEnum;
import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登陆控制器
 */
@RequestMapping("/accountcontroller")
@RestController
@Api("登陆相关的接口")
public class LoginController {
    @Autowired
    private UserMapper userMapper;

    @ApiOperation(value = "用户登录", notes = "用户登陆")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Result login(User user) {
        //todo：校验数据
        if(userMapper.getOneByUser(user) != null){
            return new Result(ResultEnum.SUCCESS);
        }
        return new Result(ResultEnum.ERROR);
    }
}
