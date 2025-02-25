package com.yogeshjava.learning;

public class MainApp {

	public static void main(String[] args) {
		
		// int val = 10;
		// A cross across the method name means - It is deprecated
		// It means it is still a valid code but it maybe removed in future versions
		// Integer value = new Integer(20);
		// Integer value = 20;
		// Boolean flag;
		
		CoachingTeam obj = new CoachingTeam("A","B","C","D");
		
		Team t1 = new Team();
		t1.setTeamName("Indian Woman's cricket team");
		System.out.println(t1.getTeamName());
		// Anonymous object
		Team t2 = new Team(34, "India", new CoachingTeam("P","Q","R","S"));
		obj.setHeadCoach("Z");
		System.out.println(t2.getManagers().getHeadCoach());
		
		
		
		/*
		System.out.println(t2.getTeamName());
		Team t3 = new Team(1, "India");
		Team t4 = new Team(4, "SA");
		Team t5 = new Team();
		t5.setTeamName("Whatever I want");
		System.out.println(t5.getTeamName());
		*/

	}

}
