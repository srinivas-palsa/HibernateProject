package com.alpha.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private int age;
	private double marks;
	
	public Student(int id, String name, int age, double marks) {
		super();
		this.id=id;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	
	public Student() {
		super();
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setMarks(double marks) {
		this.marks=marks;
	}
	
	public double getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
	
}
