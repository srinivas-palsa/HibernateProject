package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCitizenAndAdhar {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		Adhar a = new Adhar(305,949896,"PUNE");
		Citizen c = new Citizen(210,"Arey",21,a);
		
		et.begin();
		
		em.persist(c);
		
		et.commit();
	}
}
