package onetomanyAndmanytooneBi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	private int id;
	private String ename;
	
	@ManyToOne
	private Company comp;

	public Employee() {
		super();
	}

	public Employee(int id, String ename, Company comp) {
		super();
		this.id = id;
		this.ename = ename;
		this.comp = comp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Company getComp() {
		return comp;
	}

	public void setComp(Company comp) {
		this.comp = comp;
	}
	
	
	
}
