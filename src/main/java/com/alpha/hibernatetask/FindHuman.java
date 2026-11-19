package com.alpha.hibernatetask;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindHuman {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		
		String query = "select h from Human h";
		List<Human> hlist = em.createQuery(query).getResultList();
		for (Human h : hlist) {
			System.out.println(h.getName());
		}		
		
		
		et.commit();
	}
}
