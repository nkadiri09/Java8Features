package com.naren.kadiri.comparatorvsComparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableSort {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Alex", "carlayal", 1, 20));
		persons.add(new Person("Catty", "perry", 6, 25));
		persons.add(new Person("cannon", "vally", 5, 22));
		persons.add(new Person("Alex1", "vblly", 4, 33));
		persons.add(new Person("Amanda", "Arkasas", 2, 27));

		System.out.println("LastName sort");
		ComparableSort cs = new ComparableSort();
		cs.getSort(persons);
	}

	private void printAll(List<Person> persons) {
		for (Person p : persons) {
			System.out.println(p);
		}
	}

	public void getSort(List<Person> persons) {
		Collections.sort(persons);
		printAll(persons);
	}

}
