package com.example.repository;

import com.example.database.DataBaseConnection;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    private DataBaseConnection db;
    public UserRepository(DataBaseConnection db) {
        this.db = db;
    }
    public List<String> findAll() {
        return db.getUsers();
    }
    public void save(String user) {
        db.addUser(user);
    }

}
