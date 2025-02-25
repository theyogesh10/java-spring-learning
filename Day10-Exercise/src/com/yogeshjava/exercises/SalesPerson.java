package com.yogeshjava.exercises;

public class SalesPerson extends Employee {
	int target;
	boolean hasAchieved;
	
	public SalesPerson() {
		
	}
	
	public SalesPerson(int v1, String v2, double v3, int v4, boolean v5) {
		super(v1,v2,v3);
		target = v4;
		hasAchieved = v5;
	}
	
	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public boolean isHasAchieved() {
		return hasAchieved;
	}

	public void setHasAchieved(boolean hasAchieved) {
		this.hasAchieved = hasAchieved;
	}

	public double calcSalary() {
		
		double DA = 0.8 * basicSalary;
		double HRA = 0.5 * basicSalary;
		double TDS = 0.1 * basicSalary;
		double professionalTax = 200;
		
		double targetBonus = hasAchieved ? (target * 0.1 ) : 0;
		
		double totalSalary = basicSalary + DA + HRA + professionalTax + TDS + targetBonus;
		
		return totalSalary;
		
	}

}
