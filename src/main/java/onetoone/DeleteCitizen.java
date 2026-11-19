package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteCitizen {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		et.begin();
		
		
//		Citizen c = em.find(Citizen.class, 201);
//		
//		if(c!=null) {
//			em.remove(c);
//			System.out.println("DELETED");
//		}
//		else {
//			System.out.println("CITIZEN NOT FOUND");
//		}
//		
		
		
		Citizen c1 = em.find(Citizen.class, 203);
		
		if(c1!=null) {
			c1.setAdhar(null);
		}
		
		et.commit();
	}
}
