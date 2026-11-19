package onetoonebidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdatePanCard {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		et.begin();
		
		PanCard p = em.find(PanCard.class, 201);
		
		if(p!=null) {
			p.setDob("02-Aug");
			p.setPanno("UTX2026");
			p.getPer().setAge(22);
			p.getPer().setName("Abhay");
			em.merge(p);
			System.out.println("UPDATED");
		}else {
			System.out.println("PANCARD NOT FOUND");
		}
		
		et.commit();
	}
}
