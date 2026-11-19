package com.alpha.hibernatetask;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateHuman {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
//		Human h = em.find(Human.class,17);
//		if(h != null) {
//			h.setMobileno(334422);
//		}else {
//			System.out.println("Failed");
//		}
		
		
		String query = "update Human set email=:mailid where name=:targetName";
		
		Query q = em.createQuery(query);
		q.setParameter("mailid", "stylishsiddu@gmail.com");
		q.setParameter("targetName", "Siddu");
		
		int rowsaffected = q.executeUpdate();
		System.out.println(rowsaffected);
		
		et.commit();
	}
}
