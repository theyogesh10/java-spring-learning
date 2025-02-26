package com.yogeshjava.learning.rolebased;

public class MainApp {
	public static void main(String[] args) {
		
//		Student[] array = new Student[2];
//		for(int ctr=0;ctr<array.length;ctr++) {
//			array[ctr] = new Student(); 
//		}
		 
		Learnable[] participants = {new Student(), new Monkey()};
		Trainer tr = new Trainer();
		tr.train(participants);
		
	}

}
