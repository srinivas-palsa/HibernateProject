package onetomanyunidirectional;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.alpha.demo.Student;

public class FindingStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		School sc = em.find(School.class, 202);
		System.out.println(sc.getId());
		System.out.println(sc.getName());
		System.out.println(sc.getAddress());
		
		List<Student> students = sc.getSlist();
		for(Student student : students) {
			System.out.println(student.getName());
		}
		
		System.out.println("=======================");
		
		Student std = em.find(Student.class, 104);
		System.out.println(std.getId());
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getMarks());
		
		et.commit();
	}
}
