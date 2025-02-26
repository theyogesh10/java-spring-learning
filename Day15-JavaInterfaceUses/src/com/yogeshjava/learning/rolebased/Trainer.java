package com.yogeshjava.learning.rolebased;

public class Trainer {
	
	public Trainer() {
		// TODO Auto-generated constructor stub
	}
	
	public void train(Learnable[] ref) {
		for(int ctr=0;ctr<ref.length;ctr++) {
			ref[ctr].learn();
		}
	}

}
