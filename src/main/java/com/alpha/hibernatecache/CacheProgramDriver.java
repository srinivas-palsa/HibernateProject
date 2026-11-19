package com.alpha.hibernatecache;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.alpha.demo.Student;

public class CacheProgramDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em1 = emf1.createEntityManager();
		EntityTransaction et1 = em1.getTransaction();
		
		et1.begin();
		
		Student s1 = em1.find(Student.class, 102);
		System.out.println(s1);
		
		Student s2 = em1.find(Student.class,102);
		System.out.println(s2);
		
		Student s3 = em1.find(Student.class, 102);
		System.out.println(s3);
		
		et1.commit();
		
		
		
		EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em2 = emf2.createEntityManager();
		EntityTransaction et2 = em2.getTransaction();
		
		et1.begin();
		
		Student ss1 = em2.find(Student.class, 102);
		System.out.println(ss1);
		
		Student ss2 = em2.find(Student.class,102);
		System.out.println(ss2);
		
		Student ss3 = em2.find(Student.class, 102);
		System.out.println(ss3);
		
		et1.commit();
	}
}
