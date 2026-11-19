package onetomanyAndmanytooneBi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
	
	@Id
	private int id;
	private String ename;
	
	@OneToMany
	private List<Employee> emps;

	public Company(int id, String ename, List<Employee> emps) {
		super();
		this.id = id;
		this.ename = ename;
		this.emps = emps;
	}

	public Company() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return ename;
	}

	public void setName(String ename) {
		this.ename = ename;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	
}
