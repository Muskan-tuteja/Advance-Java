package com.example.database;

import java.util.ArrayList;
import java.util.List;


public class DataBaseConnection {
    private List<String> users;

    public void init() {
        users = new ArrayList<>();
        System.out.println("Db Connection ");
    }

    public List<String> getUsers() {
        return users;
    }

    public void addUser(String user) {
       users.add(user);
    }
    public void cleanup() {
        System.out.println("Db Connection !!");
    }
}



