package com.jsp.spring.app;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UseService {
    private Map<Integer, User> userDb = new HashMap<Integer, User>();

    public User createUser(User user) {
        System.out.println(user.getName());
        userDb.putIfAbsent(user.getId(), user);
        return user;
    }

    public User updated(User user) {
        if (!userDb.containsKey(user.getId()))
            return null;
            userDb.put(user.getId(), user);
            return user;
        }


    public boolean deleteUser(int id) {
        if (!userDb.containsKey(id))
            return false;
        userDb.remove(id);

        return true;
    }

    public List<User> getAllUser() {
        return new ArrayList<User>(userDb.values());
    }

    public User getUserById(int id) {
        return userDb.get(id);
    }

    public List<User> searchUsers(String name, String email) {
       return  userDb.values().stream()
                .filter(user -> user.getName().equalsIgnoreCase(name))
                .filter(user -> user.getEmail().equalsIgnoreCase(email))
                .toList();
    }
}
