package onetomanyunidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateSchool {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		et.begin();
		
		School s = em.find(School.class, 201);
		
		if(s!=null) {
			s.setName("NareshIT");
			s.setAddress("PUNE");
			s.getSlist().get(0).setName("SHREERAM");
			
			em.merge(s);
			System.out.println("UPDATED");
		}else {
			System.out.println("SCHOOL NOT FOUND");
		}
		
		
		et.commit();
	}
}
