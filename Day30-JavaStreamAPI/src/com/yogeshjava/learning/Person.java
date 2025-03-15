package com.yogeshjava.learning;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	String gender;
	int age;
	
	public Person() {
		name="A";
		gender="m";
		age=18;
	}
	
	public Person(String n, String g, int a) {
		name=n;
		gender=g;
		age=a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void printPerson() {
		System.out.println(name + ", " + this.getName());
	}

	public static List<Person> createRoster() {
		List<Person> roster=new ArrayList<Person>();
		roster.add(new Person("Sudhir","M",19));
		roster.add(new Person("Mala","F",13));
		roster.add(new Person("Sudhir","M",14));
		roster.add(new Person("Kshipra","F",44));
		roster.add(new Person("Sudhir","M",65));
		return roster;
	}
	

}
