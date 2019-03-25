package com.aisino.springboot.service;

import com.aisino.springboot.model.User;

public interface UserService {
    public String sayHi(String name);

    public User getUser(int id);
}
