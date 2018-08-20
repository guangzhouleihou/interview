package com.leihou.controller;

import com.leihou.entity.User;
import com.leihou.service.impl.UserServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/accountcontroller")
public class AccountController {
    @Autowired
     @Qualifier("userService")
    UserServiceImpl usi;
    /**
     *  用户的登陆接口
     * @param user 前端传过来的用户对象
     * @return
     */
    @ApiOperation(value = "登陆接口",httpMethod = "POST")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(User user){
        User us= usi.login(user);
        if (us!=null){
            return "登陆成功";
        }else{
            return "登陆失败";
        }
    }
}
