package jsp;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQL {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("SELECT s FROM Student s");
		
		List<Student> list = q.getResultList();
		
		for (Student e : list) {
			System.out.println(e.getName());
		}
	}
}