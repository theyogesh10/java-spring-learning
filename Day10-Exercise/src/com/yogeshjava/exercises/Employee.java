package com.yogeshjava.exercises;

public abstract class Employee {
	
	int empId;
	String empName;
	double basicSalary;
	
	public Employee() {
		
	}
	
	public Employee(int v1, String v2, double v3) {
		empId = v1;
		empName = v2;
		basicSalary = v3;
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

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public abstract double calcSalary();
		 
}
