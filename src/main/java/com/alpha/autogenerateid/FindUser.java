package com.alpha.autogenerateid;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindUser {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		//JPQL
		String query = "SELECT u  FROM User u WHERE u.mobile=66554433";

//		Query q =  em.createQuery(query);
//		Object obj = q.getSingleResult();
//		User u = (User) obj;

		User u = (User) em.createQuery(query).getSingleResult();

		System.out.println("Name: " + u.getName() + " Email: " + u.getEmail());

	}
}
