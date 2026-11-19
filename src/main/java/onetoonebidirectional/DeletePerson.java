package onetoonebidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletePerson {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Person p = em.find(Person.class, 101);
		if(p!=null) {
//			p.setPc(null);
			em.remove(p);
		}else {
			System.out.println("Person Not Found");
		}
		
		et.commit();
	}
}
