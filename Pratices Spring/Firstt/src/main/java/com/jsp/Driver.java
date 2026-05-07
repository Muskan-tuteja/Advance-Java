package com.jsp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        System.out.println("hello world");


        //spring container
        ApplicationContext context
                = new ClassPathXmlApplicationContext("config.xml");
        



    }
}