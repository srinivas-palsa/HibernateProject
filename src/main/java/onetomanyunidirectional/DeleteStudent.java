package onetomanyunidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.alpha.demo.Student;

public class DeleteStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Student s = em.find(Student.class, 105);
		if(s!=null) {
			em.remove(s);
		}else {
			System.out.println("DELETE FAILED");
		}
		
		et.commit();
	}
}
