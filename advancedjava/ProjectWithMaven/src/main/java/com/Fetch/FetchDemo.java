package com.Fetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernat.Student;

public class FetchDemo {
	public static void main(String[] args) {
		//get,load
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session=factory.openSession();
		//get-student(id)
		Student student=(Student)session.get(Student.class, 112);
		System.out.println(student);
		session.close();
		
		
		
		factory.close();
		
		
	}

}
