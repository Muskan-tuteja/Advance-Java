package com.hibernat;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

public class EmDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
	Student students = new Student();
	students.setId(123);
	students.setName("mahi");
	students.setCity("loko");
	
	Certificate certificate = new Certificate();
	certificate.setCourse("anoides");
	certificate.setDuration("2months");
	students.setCerti(certificate);
	
	Student students1 = new Student();
	students1.setId(143);
	students1.setName("mahi");
	students1.setCity("loko");
	
	Certificate certificate1 = new Certificate();
	certificate1.setCourse("Andriods");
	certificate1.setDuration("1.2months");
	students1.setCerti(certificate1);
	
	Session s = factory.openSession();
	Transaction tx = s.beginTransaction();
	
//	objects save:
	s.save(students1);
	s.save(students);
	tx.commit();
	s.close();	
	factory.close();
	
	
	
	
	
	}
	
	
	

}
