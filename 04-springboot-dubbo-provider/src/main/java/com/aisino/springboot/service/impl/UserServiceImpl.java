package com.aisino.springboot.service.impl;

import com.aisino.springboot.model.User;
import com.aisino.springboot.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0.0", timeout = 1200000)//dubblo的标签
public class UserServiceImpl implements UserService {
    @Override
    public String sayHi(String name) {
        return "Hi springboot " + name;
    }

    @Override
    public User getUser(int id) {
        User user = new User();
        user.setId(id);
        user.setName("John");
        user.setPhone("1234567");
        return user;
    }
}
