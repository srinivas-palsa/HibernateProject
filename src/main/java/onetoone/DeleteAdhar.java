package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteAdhar {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		et.begin();
		
		Adhar a = em.find(Adhar.class,103);
		if(a!=null) {
			em.remove(a);
			System.out.println("DELETED");
		}else {
			System.out.println("ADHAR NOT FOUND");
		}
		
		et.commit();
	}
}
