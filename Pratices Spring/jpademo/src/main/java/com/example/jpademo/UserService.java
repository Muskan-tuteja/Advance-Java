package com.example.jpademo;


import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRespository userRespository;
    public UserService(UserRespository userRespository) {
        this.userRespository = userRespository;
    }
    public UserClassSpringBoot createUser(UserClassSpringBoot user) {
        return  userRespository.save(user);
    }
}
