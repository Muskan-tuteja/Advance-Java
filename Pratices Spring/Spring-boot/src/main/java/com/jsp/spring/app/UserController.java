package com.jsp.spring.app;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
private Map<Integer,User> userDb=new HashMap<Integer, User>();


@PostMapping
public String createUser(@RequestBody User user){
    System.out.println(user.getName());
    System.out.println(user.getId());
    userDb.put(user.getId(),user);
    return "user created sucessfully !!";
}

}
