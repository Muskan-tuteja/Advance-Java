package com.jsp;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQL {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("SELECT s FROM Students s");
		Query q2 = em.createQuery("SELECT s FROM Student s WHERE s.name = :name");
		Query q1 = em.createQuery("SELECT s FROM Students s where s.name=:name and s.rol=:id");
		q.setParameter  ("name","java");
		q.setParameter("id", 1);
		q.setParameter("name", "Muskan");
		
		List<Students> list = q.getResultList();
		
		for (Students e : list) {
			System.out.println(e.getName());
		}
	}
}