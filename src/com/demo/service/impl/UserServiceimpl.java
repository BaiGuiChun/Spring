package com.demo.service.impl;

import com.demo.service.UserSerivce;

public class UserServiceimpl implements UserSerivce {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(){
        System.out.println("创建用户..."+name);
    }
}
