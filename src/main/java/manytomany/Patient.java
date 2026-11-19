package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Patient {
	@Id
	private int id;
	private String name;
	private String disease;
	
	@ManyToMany
	private List<Doctor> doctors;

	public Patient(int id, String name, String disease, List<Doctor> doctors) {
		super();
		this.id = id;
		this.name = name;
		this.disease = disease;
		this.doctors = doctors;
	}

	public Patient() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
	
}
