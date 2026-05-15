package org.example.demo;

import org.springframework.stereotype.Component;

@Component("myBean")
public class GreetingService {
    public void send() {
        System.out.println("Hello, ");

    }
}
