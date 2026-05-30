package com.example.jpademo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public UserClassSpringBoot createUser(@RequestBody UserClassSpringBoot user) {
        return userService.createUser(user);
    }
    @GetMapping
    public List<UserClassSpringBoot> getUsers() {
        return userService.getAllUsers();
    }

}
