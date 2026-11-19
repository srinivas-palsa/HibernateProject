package com.alpha.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteStudentById {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		int studenttobedeleted = 101;
		
		et.begin();
		
		Student s = em.find(Student.class, studenttobedeleted);
		
		if(s!=null) {
			em.remove(s);
			System.out.println("Student Deleted");
		}else {
			System.out.println("Student with "+studenttobedeleted+" not found");
		}
		
		et.commit();
		
	}
}
