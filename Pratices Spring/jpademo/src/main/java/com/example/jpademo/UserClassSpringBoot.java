package com.example.jpademo;


import jakarta.persistence.*;

@Entity
//@Table(name = "userclassspringboot")
public class UserClassSpringBoot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    //  Default constructor
    public UserClassSpringBoot() {

    }



    public UserClassSpringBoot(Long id, String name) {
        this.id = id;
        this.name = name;


    }
    public UserClassSpringBoot(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
