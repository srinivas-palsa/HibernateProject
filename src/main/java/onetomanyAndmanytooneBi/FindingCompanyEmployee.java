package onetomanyAndmanytooneBi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindingCompanyEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Company c = em.find(Company.class, 101);
		System.out.println(c.getId());
		System.out.println(c.getName());
		List<Employee> elist = c.getEmps();
		
		for(Employee ele :elist) {
			System.out.println(ele.getEname());
		}
		
		
		Employee e = em.find(Employee.class, 201);
		System.out.println(e.getId());
		System.out.println(e.getEname());
		System.out.println(e.getComp().getId());
		System.out.println(e.getComp().getName());
	}
}
