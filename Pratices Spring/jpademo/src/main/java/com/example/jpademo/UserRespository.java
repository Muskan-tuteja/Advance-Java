package com.example.jpademo;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<UserClassSpringBoot,Long> {
}
