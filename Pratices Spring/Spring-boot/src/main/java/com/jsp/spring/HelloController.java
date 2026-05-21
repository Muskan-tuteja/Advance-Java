package com.jsp.spring;

import com.jsp.spring.app.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!hii ";
    }

    @GetMapping("/user")
//    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public User getUser(){
        User user = new User(1,"muskkan",34, "udgsyy@jsdbshj");
//        User user2 = new User(2,"musu",31);
        return user;

    }
}
