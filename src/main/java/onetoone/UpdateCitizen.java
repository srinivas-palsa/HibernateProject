package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateCitizen {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Citizen c = em.find(Citizen.class, 202);
		
		if(c!=null) {
			c.setAge(27);
			c.setName("SURESH");
			c.getAdhar().setAdharno(707070);
			c.getAdhar().setCity("PUNE");
			em.merge(c);
			System.out.println("UPDATED");
		}else {
			System.out.println("CITIZEN NOT FOUND");
		}
		
		
		et.commit();
	}
}
