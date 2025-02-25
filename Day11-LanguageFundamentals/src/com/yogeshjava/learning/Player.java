package com.yogeshjava.learning;

public class Player {
	int playerId;
	String playerName;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player(int v1, String v2) {
		playerId=v1;
		playerName=v2;
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

	public boolean equals(Player p2) {
		if(playerId==p2.getPlayerId()) {
			return true;
		}
		else {
			return false;
		}
	}

	public String toString() {
		return "[Player : playerId - " + this.playerId + ", playerName - " + this.playerName +"]";
	}
	

}
