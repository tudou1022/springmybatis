package com.boge.springmybatis.controller;

import com.boge.springmybatis.entity.User;
import com.boge.springmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author zhangwenbo
 * @DATE 2018/12/10 - 18:48
 * @Description:
 */
@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test/selectUser")
    public List<User> getUser(){
        return  userService.getUserList();
    }
}
