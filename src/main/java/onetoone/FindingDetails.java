package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class FindingDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Adhar adhar = em.find(Adhar.class, 101);	
		System.out.println(adhar);
		System.out.println(adhar.getId());
		System.out.println(adhar.getAdharno());
		System.out.println(adhar.getCity());
		
		
		Citizen citizen = em.find(Citizen.class, 201);
		System.out.println(citizen);
		System.out.println(citizen.getId());
		System.out.println(citizen.getName());
		System.out.println(citizen.getAge());
		System.out.println(citizen.getAdhar());
		System.out.println(citizen.getAdhar().getId());
		System.out.println(citizen.getAdhar().getAdharno());
		System.out.println(citizen.getAdhar().getCity());
		
		
		
		et.commit();
		
		
		
	}
}
