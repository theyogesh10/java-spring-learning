package com.yogeshjava.exercises;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MainApp app = new MainApp();
		app.showPreamble();
		app.performAction();
		sc.close();
		
	}
	
	public void showPreamble() {
		System.out.println("This Application will accept dat from the user and perform salary calculation");
		
	}
	
	public void performAction() {
		Scanner sc = new Scanner(System.in);
		Employee ref = createEmployee(sc);
		if(ref != null) {
			calcSalary(ref);
		}
		else {
			System.out.println("Salary calculation cannot be proceed due to invalid input!");
		}
	}
	
	public Employee createEmployee(Scanner sc) {
		
		Employee obj = null;
		
		System.out.println("Enter Employee Type: 1 for Manager, and 2 for SalesPerson");
		 
		int choice = sc.nextInt();
		if(choice==1) {
			
			System.out.println("Enter Employee Id: ");
			int empId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Name : ");
			String empName = sc.nextLine();
			System.out.println("Enter Basic Salary : ");
			double basicSalary = sc.nextDouble();
			System.out.println("Enter Number of Projects Managed : ");
			int projectManaged = sc.nextInt();
			
			obj = new Manager(empId,empName,basicSalary,projectManaged);
		}
		else {
			if(choice==2) {
				
				System.out.println("Enter Employee Id: ");
				int empId = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Employee Name : ");
				String empName = sc.nextLine();
				System.out.println("Enter Basic Salary : ");
				double basicSalary = sc.nextDouble();
				System.out.println("Enter Sales Target: ");
				int target = sc.nextInt();
				System.out.println("Has the target been Achieved (true/false) : ");
				boolean hasAchieved = sc.nextBoolean();
				
				obj = new SalesPerson(empId,empName,basicSalary,target,hasAchieved);
			}
			else {
				System.out.println("Invalid Input...!");
			}
		}
		return obj;
	}
	
	public void calcSalary(Employee ref) {
		System.out.println("The total salary of the employee is " + ref.calcSalary());
	}
}
