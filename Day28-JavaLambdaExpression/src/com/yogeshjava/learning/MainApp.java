package com.yogeshjava.learning;

public class MainApp {

	public static void main(String[] args) {
		
		// There are three ways to implement an interface : 
		
		// Approach 1 : Create a java class
		
		ArithmeticOps ref=new Addition();
		System.out.println(ref.operation(12, 12));
		
		
		// Approach 2 : Create an anonymous inner class
		
		ArithmeticOps subtract=new ArithmeticOps() {
			
			public int operation(int op1, int op2) {
				return op1-op2;
			}
		};
		System.out.println(subtract.operation(12, 12));
		
		
		// Approach 3 : Lambda Expression
		
		ArithmeticOps mul2=new ArithmeticOps() {	// Create an anonymous inner class
			
			@Override
			public int operation(int op1, int op2) {
				System.out.println("Within method");
				return op1*op2;
			}
		};
		System.out.println(mul2.operation(12, 12));
		
		ArithmeticOps mul=(a,b)->{					// Lambda Expression
			System.out.println("This is also lambda body");
			return a*b;
		};
		System.out.println(mul.operation(12, 12));
		
		ArithmeticOps divide=(a,b)->a/b;			// Lambda Expression
		System.out.println(divide.operation(12, 12));
		
	}
	
}
