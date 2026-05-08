package com.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component(value = "person")
public class Person {
    private String name;
    private int id;
    @Autowired
    private Mobile mobile;


    public String getName() {

        return name;
    }


//    @Value(value = "muskan")
    public void setName(String name) {

        this.name = name;
    }
    public int getId() {

        return id;
    }

//@Value(value = "789")
    public void setId(int id) {
        this.id = id;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void m1(){
        System.out.println("post con");

    }



    public Person(@Value(value = "isha") String name,@Value(value = "10") int id, Mobile mobile) {
        this.name = name;
        this.id = id;
        this.mobile = mobile;
    }
}
