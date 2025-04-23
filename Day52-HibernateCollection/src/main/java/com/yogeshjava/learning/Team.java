package com.yogeshjava.learning;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="teammaster")
public class Team {
	
	@Id
	@Column(name="tid")
	int teamId;
	@Column(name="tname")
	String teamName;
	@OneToMany(targetEntity = Player.class, cascade = CascadeType.ALL)
	List<Player> players;

	public Team() {
		// TODO Auto-generated constructor stub
	}
	
	public Team(int v1, String v2, List<Player> v3) {
		teamId=v1;
		teamName=v2;
		players=v3;
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

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	
}
