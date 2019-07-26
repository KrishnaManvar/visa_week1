package com.visa.prj.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	private String email;
	
	private String name;
	
	private int empId;
	
	private String department;

	public Employee() {
		super();
	}

	
	public Employee(String email, String name, int empId, String department) {
		super();
		this.email = email;
		this.name = name;
		this.empId = empId;
		this.department = department;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

}
