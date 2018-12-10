package com.boge.springmybatis.service;

import com.boge.springmybatis.entity.User;

import java.util.List;

/**
 * @Author zhangwenbo
 * @DATE 2018/12/10 - 18:49
 * @Description:
 */
public interface UserService {
    List<User> getUserList();
}
