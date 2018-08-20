package com.leihou.controller;

import com.leihou.entity.User;
import com.leihou.service.impl.UserServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller("/hm-usercontroller")
public class HmUserController {
      @Autowired
      @Qualifier("userService")
      UserServiceImpl usi;

      @RequestMapping(value = "/createHmUser", method = RequestMethod.POST)
      @ApiOperation(value = "创建用户接口", httpMethod = "POST")
      public String createHmUser(User user) {
            //在创建用户之前，首先看该用户是否已经存在
            User fUser = usi.queryById(user.getId());
            //如果fUser==null，说明该用户不存在，可以创建
            if (fUser == null) {
                  int index = usi.createUser(user);
                  if (index > 0) {
                        return "创建成功";
                  } else {
                        return "创建失败";
                  }
            } else {
                  return "该用户已经存在不能创建";
            }
      }

      @RequestMapping(value = "/getHmUser", method = RequestMethod.PUT)
      @ApiOperation(value = "更新用户接口", httpMethod = "PUT")
      public String update(User user) {
            //首先根据传来的用户信息，依据用户的编号来查询一下
            User u = usi.queryById(user.getId());
            if (u != null) {
                  int flag = usi.update(user);
                  if (flag > 0) {
                        return "修改成功";
                  } else {
                        return "修改失败";
                  }
            } else {
                  return "该用户不存在";
            }
      }

      @RequestMapping(value = "/getHmUser", method = RequestMethod.PUT)
      @ApiOperation(value = "查询某个⽤用户信息接口", httpMethod = "PUT")
      public String qeuryHmUserById(String id) {
            User u = usi.queryById(id);
            if (u != null) {
                  //可以将该用户信息进行响应出去
                  return "查到了";
            } else {
                  return "该用户不存在";
            }
      }


      @RequestMapping(value = "/getHmUser", method = RequestMethod.GET)
      @ApiOperation(value = "查询所有用户信息接口", httpMethod = "PUT")
      public String getHmUsers() {
            List<User> list = usi.queryAll();
            if (list != null && list.size() > 0) {
                  //查到数据后将它进行响应出去
            } else {
                  return "没有查询到数据";
            }
      }
}

