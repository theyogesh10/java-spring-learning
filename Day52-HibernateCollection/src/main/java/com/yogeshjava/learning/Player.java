package com.yogeshjava.learning;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="playermaster")
public class Player {
	@Id
	@Column(name="pid")
	int playerId;
	@Column(name="pname")
	String playerName;
	@ManyToOne(targetEntity = Team.class)
	Team team;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player(int v1, String v2, Team v3){
		playerId=v1;
		playerName=v2;
		team=v3;
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

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
	

}
