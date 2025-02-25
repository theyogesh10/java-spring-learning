package com.yogeshjava.learning;


public class Team {

	private int teamId;
	private String teamName;
	// This is called as containment 
	CoachingTeam managers;		// reference variable
	
	public Team() {
		// Default constructor - No Parameter constructor
	}
	
	public Team(int v1, String v2, CoachingTeam v3) {
		// All parameter constructor
		teamId = v1;
		teamName = v2;
		managers = v3;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public CoachingTeam getManagers() {
		return managers;
	}

	public void setManagers(CoachingTeam managers) {
		this.managers = managers;
	}
	
	

}
