package onetoonebidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletePanCard {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();

		PanCard p = em.find(PanCard.class, 203);
		
		if(p!=null) {
			p.setPer(null);	
//			em.remove(p);
		}else {
			System.out.println("DELETE FAILED");
		}

		et.commit();

	}
}
