package onetomanyAndmanytooneBi;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavingCompanyEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Company c = new Company(101,"TCS",null);
		Employee e1 = new Employee(201,"Dinga",c);
		Employee e2 = new Employee(202,"Dingi",c);
		Employee e3 = new Employee(203,"Donga",c);
		c.setEmps(Arrays.asList(e1,e2,e3));
		et.begin();
		
		em.persist(c);
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		
		et.commit();
		
		
	}
}
