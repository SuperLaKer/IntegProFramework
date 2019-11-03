package com.slk.controller;

import com.slk.api.UserAPI;
import com.slk.domain.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.slk.dao.UserMapper;
import com.slk.domain.User;


import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController implements UserAPI {

    @Autowired
    UserMapper userMapper;

    // API改造
    @GetMapping("/")
    @ResponseBody
    @Override
    public StatusCode findAll() {

        List<User> users = userMapper.findAll();

        // TODO: 使用枚举对状态和错误信息进行改造
        //      封装一个方法，传入错误信息和data直接返回封装好的对象

        StatusCode statusCode = new StatusCode();
        statusCode.setStatusCode(200);
        statusCode.setErrorMessage("ok");
        statusCode.setData(users);

        return statusCode;

    }
}

