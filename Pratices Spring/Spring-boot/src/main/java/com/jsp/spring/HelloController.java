package com.jsp.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!hii ";
    }

    @GetMapping("/user")
    public User getUser(){
        User user = new User(1,"muskkan",34);
        User user2 = new User(2,"musu",31);
        return user2;

    }
}
