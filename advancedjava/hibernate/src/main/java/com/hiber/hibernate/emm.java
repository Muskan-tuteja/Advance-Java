package com.hiber.hibernate;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@entity

@Table(name = "user_table")
public class emm {
	@Id
	private int id;
	@Column(name = "username",unique=true,nullable=false )
	private String name;
	private String City;
	private Long phone;
	private double age;
	@CreationTimestamp
	private LocalTime time;
	
	
	
	public int getId() {
		return id;
	}
	public emm(int id, String name, String city, Long phone, double age, LocalTime time) {
		super();
		this.id = id;
		this.name = name;
		City = city;
		this.phone = phone;
		this.age = age;
		this.time = time;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public emm() {
		super();
		
	}

}
