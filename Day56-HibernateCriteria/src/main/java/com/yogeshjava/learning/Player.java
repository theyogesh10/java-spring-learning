package com.yogeshjava.learning;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class Player {
	
	@Id
	@Column(name="playerid")
	int playerId;
	@Column(name="playername")
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
	
}
