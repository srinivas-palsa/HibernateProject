package com.alpha.autogenerateid;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAllUsers {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		et.begin();
		
		String query = "SELECT u FROM User u";
		
//		Query q = em.createQuery(query);
//		List<User> u = q.getResultList();
		
		List<User> u = em.createQuery(query).getResultList();
		
		for (User user : u) {
			System.out.println(user);
		}
		
		
		et.commit();
	}
}
