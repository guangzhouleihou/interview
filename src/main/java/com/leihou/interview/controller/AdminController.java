package com.leihou.interview.controller;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @RequestMapping(value = "/user/load", method = { RequestMethod.GET })
    public String login(){

        return "";
    }
}
