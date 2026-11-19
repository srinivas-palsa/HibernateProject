package com.alpha.hibernatetask;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveHuman {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Human h = new Human("Siddu",1236,"stylissiddu@gmail.com");
		Human h2 = new Human("Simran",443922,"sexysimran@gmail.com");
		
		em.persist(h);
//		em.persist(h2);
		
		et.commit();
	}
}
