package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class main {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Students s1 = new Students (1,"anhjj",45,"n@234");
	em.persist(s1);
	et.commit();
	
}

}
