package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateAdhar {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		et.begin();
		
		Adhar a = em.find(Adhar.class, 101);
		
		if(a!=null) {
			a.setAdharno(808080);
			a.setCity("PUNE");
			
			em.merge(a);
			System.out.println("UPDATED");
			
		}else {
			System.out.println("ADHAR NOT FOUND");
		}
		
		et.commit();
	}
}
