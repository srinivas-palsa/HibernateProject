package onetoonebidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavingPersonPanCard {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = new Person(101,"Amar",23,null);
		PanCard pc = new PanCard(203,"RTX2020","12-Aug",p);
		p.setPc(pc);
		
		et.begin();
		
		em.persist(p);
		em.persist(pc);
		
		et.commit();
		
	}
}
