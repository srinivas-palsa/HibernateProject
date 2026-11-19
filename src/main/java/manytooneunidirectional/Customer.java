package manytooneunidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Customer {
	@Id
	private int id;
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Bank bank;

	public Customer() {
		super();
	}

	public Customer(int id, String name, Bank bank) {
		super();
		this.id = id;
		this.name = name;
		this.bank = bank;
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

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
}
