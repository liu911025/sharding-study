package com.sharding.controller;

import com.sharding.entity.UserEntity;
import com.sharding.enums.UserSexEnum;
import com.sharding.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private User1Service user1Service;

    @RequestMapping("getUsers")
    public List<UserEntity> getUsers() {
        List<UserEntity> users=user1Service.getUsers();
        return users;
    }

    //测试
    @PostMapping(value="save")
    public String updateTransactional(@RequestBody UserEntity user) {
        user.setUserSex(UserSexEnum.WOMAN);
        user1Service.updateTransactional(user);
        return "test";
    }

    @RequestMapping("get/{id}")
    public UserEntity getUserById(@PathVariable("id") Long id) {
        return user1Service.getById(id);
    }
}
