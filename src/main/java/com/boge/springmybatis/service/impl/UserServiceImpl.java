package com.boge.springmybatis.service.impl;

import com.boge.springmybatis.dao.UserDao;
import com.boge.springmybatis.entity.User;
import com.boge.springmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zhangwenbo
 * @DATE 2018/12/10 - 18:50
 * @Description:
 */
@Service(value = "userServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.selectUser();
    }
}
