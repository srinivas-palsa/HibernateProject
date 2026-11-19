package onetomanyunidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.alpha.demo.Student;

public class UpdateStudent {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Student s = em.find(Student.class, 102);
		if(s!=null) {
			s.setName("Ram");
			s.setMarks(12);
			em.merge(s);
			System.out.println("UPDATED");
		}else {
			System.out.println("STUDENT NOT FOUND");
		}
		
		et.commit();
	}
}
