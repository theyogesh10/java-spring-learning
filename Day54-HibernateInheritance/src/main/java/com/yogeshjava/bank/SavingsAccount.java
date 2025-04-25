package com.yogeshjava.bank;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="savingspersub")
public class SavingsAccount extends Account {

	float minBalance;
	
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public SavingsAccount(int v1, String v2, float v3, float v4) {
		super(v1, v2, v3);
		minBalance=v4;
	}

	public float getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(float minBalance) {
		this.minBalance = minBalance;
	}
	
	
}
