package com.yogeshjava.bank;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="acctpersub")
@Inheritance(strategy = InheritanceType.JOINED)
public class Account {
	
	@Id
	@Column(name="actid")
	int actId;
	@Column(name="actname")
	String actName;
	float balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(int v1, String v2, float v3) {
		actId=v1;
		actName=v2;
		balance=v3;
	}

	public int getActId() {
		return actId;
	}

	public void setActId(int actId) {
		this.actId = actId;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	

}
