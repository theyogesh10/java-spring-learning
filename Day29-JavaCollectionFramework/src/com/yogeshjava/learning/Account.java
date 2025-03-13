package com.yogeshjava.learning;

public class Account implements Comparable<Account>{
	
	int actId;
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

	
	@Override
	public int hashCode() {
		return this.actId;
	}

	@Override
	public boolean equals(Object obj) {
		Account otherObj=(Account)obj;
		if(this.actId==otherObj.actId) {
			return true;
		}
		else {
			return false;
		}
	}

	
	@Override
	public int compareTo(Account o) {
		if(this.actId<o.actId) {
			return -1;
		}
		else {
			if(this.actId>o.actId) {
				return 1;
			}
			else {
				return 0;
			}
		}
	}
	
	
	/*
	 * @Override public int compareTo(Account o) { return
	 * this.actName.compareTo(o.actName); }
	 */
	

}
