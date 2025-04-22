package com.yogeshjava.learning;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee") 	// <class name=... table=...>
public class Employee {
	
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "empid")
	int empId;		// if explicit column name not given it will be store as emp_id
	@Column(name = "empname")
	String empName;
	@Column(name = "salary")
	float salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int v1, String v2, float v3) {
		empId=v1;
		empName=v2;
		salary=v3;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	

}
