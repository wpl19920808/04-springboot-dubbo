package com.aisino.springboot.controller;

import com.aisino.springboot.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //provider提供了版本，所以消费者也需要指定版本
    @Reference(version = "1.0.0")
    private UserService userService;

    @RequestMapping("/boot/user")
    public Object getUser(@RequestParam("id") Integer id){
        return userService.getUser(id);
    }

    @RequestMapping("/boot/sayhi")
    public String sayHi(@RequestParam("name") String name){
        return userService.sayHi(name);
    }
}
