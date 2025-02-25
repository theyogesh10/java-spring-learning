package com.yogeshjava.learning;

public class MainApp {

	public static void main(String[] args) {
		
		Player p1 = new Player(101,"Harshad Kumar Nagpure");
		Player p2 = new Player(101,"Harshad Kumar Nagpure");
		
		/*
		 * if(p1==p2) { System.out.println("Same"); } else {
		 * System.out.println("Different"); }
		 */
		
		/*
		 * if(p1.getPlayerId()==p2.getPlayerId() &&
		 * p1.getPlayerName()==p2.getPlayerName()) { System.out.println("Same"); } else
		 * { System.out.println("Different"); }
		 */
		
		
		System.out.println(p1);
		System.out.println(p2);
		
		// com.yogeshjava.learning.Player@2f92e0f4
		// fully qualified name of the class( package name + class name) @ HashCode
		
		
		if(p1.equals(p2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
		
	}
}
