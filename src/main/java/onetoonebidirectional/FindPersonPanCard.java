package onetoonebidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindPersonPanCard {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Person p = em.find(Person.class, 101);
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getPc().getPanno());
		
		System.out.println("=================");
		
		PanCard pc = em.find(PanCard.class, 201);
		System.out.println(pc.getPanno());
		System.out.println(pc.getPer().getName());
		
		et.commit();
	}
}
