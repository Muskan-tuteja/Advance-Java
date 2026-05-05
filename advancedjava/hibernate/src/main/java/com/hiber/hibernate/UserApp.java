package com.hiber.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserApp {
	public static void main(String[] args) {
		EntityManagerFactory emg = Persistence.createEntityManagerFactory("java");
		EntityManager em = emg.createEntityManager();
		EntityTransaction ef = em.getTransaction();
		
		UserApp a = new UserApp();
		
	}
//	EntityManagerFactory em = emf.EntityMangerFactory();
}
