package onetomanyunidirectional;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.alpha.demo.Student;

public class SaveSchoolStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s1 = new Student(111,"Somesh",23,69.9);
		Student s2 = new Student(112,"Nikitha",22,71.6);
		Student s3 = new Student(113,"Ajinkya",21,80.0);
		
		List<Student> slist = Arrays.asList(s1,s2,s3);
		School sch = new School(201,"JSP","Hyd",slist);
		
		
		et.begin();
		
//		em.persist(s1);
//		em.persist(s2);
//		em.persist(s3);
		em.persist(sch);
		
		et.commit();
	}
}
