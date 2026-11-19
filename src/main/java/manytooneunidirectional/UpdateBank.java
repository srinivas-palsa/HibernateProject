package manytooneunidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateBank {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Bank b = em.find(Bank.class,101);
		
		if(b!=null) {
			b.setName("Kotak");
			em.merge(b);
			
			System.out.println("UPDATED");
		}
		else {
			System.out.println("BANK NOT FOUND");
		}
		et.commit();
	}
}
