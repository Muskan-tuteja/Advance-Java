package com.jsp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
//        System.out.println("hello world");


        //spring container
       ConfigurableApplicationContext  context
                = new ClassPathXmlApplicationContext("config.xml");
//        Object ob = context.getBean("Students");
        Person person = (Person) context.getBean("person");
        Person s=(Person) person;
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getId());
//        Students s = (Students) ob;
//        s.m1();


//        System.out.println(context.isActive());
//        context.close();
//        System.out.println(context.isActive());



    }
}