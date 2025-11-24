package com.yogeshjava.learning;

public class Player {
	
	int playerId;
	String playerName;
	int jerseyNumber;
	SpecialDate dob;
	
	public Player() {
		System.out.println("Default constructor - Player");
	}
	
	public Player(int v1, String v2, int v3, SpecialDate v4) {
		playerId=v1;
		playerName=v2;
		jerseyNumber=v3;
		dob=v4;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	
	public SpecialDate getDob() {
		return dob;
	}

	public void setDob(SpecialDate dob) {
		this.dob = dob;
	}

	public void setup() {
		System.out.println("Setting up the application");
	}
	
}
