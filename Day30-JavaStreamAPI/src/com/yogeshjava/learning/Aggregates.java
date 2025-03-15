package com.yogeshjava.learning;

import java.util.List;

public class Aggregates {
	public static void main(String[] args) {
		List<Person> persons=Person.createRoster();
		// for-each
		/* persons.stream().forEach(value->System.out.println(value.getName())); */
		
		// filter 
		// 1. Stream API Approach
		/*
		 * persons.stream().filter(ref->ref.getGender().equals("M") && ref.getAge() >
		 * 18).forEach(itsjustaname->System.out.println(itsjustaname.getName()));
		 */		
		
		// 2. Traditional For-Each Loop Approach :
		/*
		 * for (Person p : persons) { if(p.getGender().equals("M") && p.getAge() > 18) {
		 * System.out.println(p.getName()); } }
		 */
		
		// pipeline
		/*
		 * double average =
		 * persons.stream().filter(criteria->criteria.getGender().equals("M")).mapToInt(
		 * Person::getAge).average().getAsDouble();
		 * System.out.println("Average of male age is : " + average);
		 */
		
		
	}

}
