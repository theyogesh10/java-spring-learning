package com.yogeshjava.learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
		
		// collect
		
		  HashMap<String, List<Person>> byName = (HashMap<String, List<Person>>)
		  persons.stream().collect(Collectors.groupingBy(Person::getName));
		  
		  for(String ref : byName.keySet()) { 
			  System.out.println("The name " + ref + " occurs " + byName.get(ref).size()); 
		  }
		 		
	}

}
