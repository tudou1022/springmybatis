package com.boge.springmybatis.entity;

import java.math.BigDecimal;

/**
 * @Author zhangwenbo
 * @DATE 2018/12/6 - 12:22
 * @Description:
 */

public class User {
    private Long id;

    private String name;

    private String username;

    private Integer age;

    private BigDecimal balance;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
