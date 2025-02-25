package com.yogeshjava.exercises;

public class Manager extends Employee {
	int projectsManaged;

	public Manager() {
		
	}
	
	public Manager(int v1, String v2, double v3, int v4) {
		super(v1,v2,v3);
		projectsManaged = v4;			
	}
	
	public int getProjectsManaged() {
		return projectsManaged;
	}

	public void setProjectsManaged(int projectsManaged) {
		this.projectsManaged = projectsManaged;
	}

	public double calcSalary() {
		
		double DA = 0.8 * basicSalary;
		double HRA = 0.5 * basicSalary;
		double TDS = 0.1 * basicSalary;
		double projectBonus = projectsManaged * 1000;
		double professionalTax = 200;
		
		double totalSalary = basicSalary + DA + HRA + professionalTax + TDS + projectBonus;
		
		return totalSalary;
	}
}
