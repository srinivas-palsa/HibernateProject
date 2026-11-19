package manytooneunidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindingBankCustomer {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Bank bnk = em.find(Bank.class,101);
		System.out.println(bnk.getId());
		System.out.println(bnk.getName());
		
		System.out.println("==============");
		
		Customer cust = em.find(Customer.class, 204);
		System.out.println(cust.getId());
		System.out.println(cust.getName());
		System.out.println(cust.getBank().getName());
		
		
		et.commit();
	}
}
