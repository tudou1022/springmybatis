package com.boge.springmybatis.dao;

import com.boge.springmybatis.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author zhangwenbo
 * @DATE 2018/12/10 - 18:46
 * @Description:
 */
@Component
public interface UserDao {

    List<User> selectUser();
}
