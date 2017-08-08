package com.example.ssmspringboot.controller;

import com.example.ssmspringboot.mapper.UserMapper;
import com.example.ssmspringboot.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/login")
    public User login() {
        User user = userMapper.searchUser();
        return user;
    }

    @RequestMapping("/index")
    public User index() {
        User user = userMapper.selectUser();
        return user;
    }
}
