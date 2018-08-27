package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.common.ResultEnum;
import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * 用户控制器
 */
@RequestMapping("/hm-usercontroller")
@RestController
@Api("用户相关的接口")
public class UserController {
    //简化service层，直接操作dao
    @Autowired
    private UserMapper userMapper;

    @ApiOperation(value = "创建一个新用户", notes = "创建一个新的用户信息")
    @RequestMapping(value = "/createHmUser",method = RequestMethod.POST)
    public Result add(User user) {
        //todo：校验数据
        user.setId(UUID.randomUUID().toString());
        if(userMapper.insert(user) == 1){
            return new Result(ResultEnum.SUCCESS);
        }
        return new Result(ResultEnum.ERROR);
    }

    @ApiOperation(value = "更新一个新用户", notes = "更新一个新的用户信息")
    @RequestMapping(value = "/getHmUser",method = RequestMethod.PUT)
    public Result update(User user) {
        //todo：校验数据
        if(userMapper.update(user) == 1){
            return new Result(ResultEnum.SUCCESS);
        }
        return new Result(ResultEnum.ERROR);
    }

    @ApiOperation(value = "查询一个用户信息", notes = "查询一个用户信息")
    @RequestMapping(value = "/getHmUser",method = RequestMethod.GET)
    public Result queryOne(String id) {
        //todo：校验数据
        Result result = new Result(ResultEnum.SUCCESS);
        result.setObj(userMapper.getOne(id));
        return result;
    }

    @ApiOperation(value = "查询全部用户信息", notes = "查询全部用户信息")
    @RequestMapping(value = "/getHmUsers",method = RequestMethod.GET)
    public Result queryOne() {
        //todo：校验数据
        Result result = new Result(ResultEnum.SUCCESS);
        result.setObj(userMapper.getAll());
        return result;
    }
}
