package com.yogeshjava.learning;

public class Team implements Printable, Displayable{
	int teamId;
	String teamName;

	public Team() {
		// TODO Auto-generated constructor stub
	}
	public Team(int v1, String v2) {
		teamId=v1;
		teamName=v2;
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
	
	@Override
	public void print() {
		System.out.println("Print the Team");	
	}
	@Override
	public void display() {
		System.out.println("Display the Team");		
	}
	
	
	
}
