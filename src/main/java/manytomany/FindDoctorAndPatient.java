package manytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindDoctorAndPatient {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("srinivas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		et.begin();
		
		Patient p = em.find(Patient.class, 201);
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getDisease());
		
		System.out.println(p.getDoctors().get(0).getName());
		System.out.println(p.getDoctors().get(1).getName());
		
		System.out.println(p.getDoctors().get(0).getPatients().get(1).getName());
		
		
		
		Doctor d = em.find(Doctor.class, 102);
		System.out.println(d.getId());
		System.out.println(d.getName());
		System.out.println(d.getSpec());
		
		System.out.println(d.getPatients().get(0).getName());
		System.out.println(d.getPatients().get(1).getName());
		
		System.out.println(d.getPatients().get(0).getDoctors().get(0).getName());		
		System.out.println(d.getPatients().get(0).getDoctors().get(1).getName());
		
		et.commit();
	}
}
