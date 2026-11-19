package com.alpha.hibernatetask;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteHuman {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		String query = "delete from Human where name=:targetName";
		
		Query q =em.createQuery(query).setParameter("targetName", "Siddu");
		int noofhumansdeleted = q.executeUpdate();
		System.out.println(noofhumansdeleted);
		
		
		
		et.commit();
	}
}
