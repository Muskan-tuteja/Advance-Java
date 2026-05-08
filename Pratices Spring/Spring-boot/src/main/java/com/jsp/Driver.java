package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Driver {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Person be = context.getBean(Person.class);
        System.out.println(be);
        System.out.println(be.getName());
        System.out.println(be.getId());
        System.out.println(be.getMobile());


    }

}
