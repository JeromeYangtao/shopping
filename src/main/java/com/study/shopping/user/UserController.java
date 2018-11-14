package com.study.shopping.user;

import com.study.shopping.user.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    public UserController() {
    }

    @GetMapping("/users")
    public User listUser() {
        return new User(1, "name");
    }
    @GetMapping("/test")
    public String getUser(){
        return "test";
    }
}
