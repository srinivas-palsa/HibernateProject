package onetomanyunidirectional;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.alpha.demo.Student;

public class DeleteSchool {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
//		School s= em.find(School.class, 201);
//		if(s!=null) {
//			em.remove(s);
//		}else {
//			System.out.println("DELETE FAILED");
//		}
		
		School sc = em.find(School.class, 202);
		List<Student> slist = sc.getSlist();
		int studentidtoremove = 106;
		Student studenttoremove=null;
		if(sc!=null) {
			for(Student student : slist) {
				if(student.getId()==studentidtoremove) {
					studenttoremove = student;
				}
			}
		}
		
		if(studenttoremove != null) {
			slist.remove(studenttoremove);
		}
		sc.setSlist(slist);
		em.merge(sc);
		
		em.remove(studenttoremove);
		
		
		
		et.commit();
	}
}
