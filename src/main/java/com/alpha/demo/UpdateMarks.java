package com.alpha.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateMarks {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		int id=101;
		double marks = 69.8;
		int age=25;
		et.begin();
		
		Student s = em.find(Student.class, id);
		if(s!=null) {
			s.setMarks(marks);
			s.setAge(age);
			em.merge(s);
			System.out.println("Student Marks Updated");
		}else {
			System.out.println("Student with "+id+" not found");
		}
		
		et.commit();
		
	}
}
