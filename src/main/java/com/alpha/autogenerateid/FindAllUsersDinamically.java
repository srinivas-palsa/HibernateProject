package com.alpha.autogenerateid;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindAllUsersDinamically {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Scanner sc = new Scanner(System.in);
		
		String query = "SELECT u FROM User u WHERE u.mobile=:mob";
		
		System.out.println("Enter Mobile No: ");
		long inputmobno = sc.nextLong();
		
		User u  = (User) em.createQuery(query).setParameter("mob", inputmobno).getSingleResult();
			
		System.out.println("Name: "+u.getName()+" EMail: "+u.getEmail());
		
		
		et.commit();
	}
}
