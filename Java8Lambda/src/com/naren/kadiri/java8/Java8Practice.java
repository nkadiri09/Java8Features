package com.naren.kadiri.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8Practice {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Alex", "carlayal", 1, 20),
				new Person("Anna", "campel", 3, 40),
				new Person("Catty", "perry", 6, 25),
				new Person("cannon", "vally", 5, 22),
				new Person("Alex1", "vblly", 4, 33),
				new Person("Amanda", "Arkasas", 2, 27));

		// sorting the elements with LastName
		printAll(persons);
		// Creat a method that prints all elements in the list
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				System.out.println((p1.getLastName().compareTo(p2.getLastName())));
				return (p1.getLastName().compareTo(p2.getLastName()));
			}
		});
		System.out.println("-----------------------------------------------------");
		printAll(persons);
		
		 
		 

	}

	private static void printAll(List<Person> persons) {
		for (Person p : persons) {
			System.out.println(p.toString());
		}
	}

}
