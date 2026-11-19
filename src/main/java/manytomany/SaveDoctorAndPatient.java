package manytomany;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveDoctorAndPatient {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Doctor d1 = new Doctor(101,"Allen","Cardio",null);
		Doctor d2 = new Doctor(102,"Kevin","Neuro",null);
		Doctor d3 = new Doctor(103,"Smith","Dentist",null);
		
		Patient p1 = new Patient(201,"Amith","Fever",Arrays.asList(d1,d2));
		Patient p2 = new Patient(202,"Ankit","Cold",Arrays.asList(d2,d3));
		Patient p3 = new Patient(203,"Abhay","Cough",null);
		
		d1.setPatients(Arrays.asList(p1,p2));
		d2.setPatients(Arrays.asList(p2,p3));
		
		et.begin();
		
		em.persist(d1);
		em.persist(d2);
		em.persist(d3);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		et.commit();
		
	}
}
