package org;

import com.example.config.ConfigApp;
import com.example.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigApp.class);
        UserController userController = context.getBean(UserController.class);
        userController.createUser("msuksna");
        userController.createUser("mjsubn");
userController.ListUsers();
    }
}