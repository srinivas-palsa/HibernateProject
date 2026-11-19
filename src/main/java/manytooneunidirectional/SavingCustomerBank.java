package manytooneunidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavingCustomerBank {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Bank b = new Bank(110,"Axis");
		Customer c1 = new Customer(224,"Amit",b);
		Customer c2 = new Customer(225,"Ankit",b);
		Customer c3 = new Customer(226,"Amey",b);
		
//		em.persist(b);
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);		
		
		et.commit();
	}
}
