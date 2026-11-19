package manytooneunidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateCustomer {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Customer c = em.find(Customer.class,202);
		
		if(c!=null) {
			c.setName("ROY");
			c.getBank().setName("SBI");
			System.out.println("UPDATED");
		}
		else {
			System.out.println("CUSTOMER NOT FOUND");
		}
		et.commit();
	}
}
