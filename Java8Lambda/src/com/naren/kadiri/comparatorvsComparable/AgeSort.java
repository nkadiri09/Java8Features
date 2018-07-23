package com.naren.kadiri.comparatorvsComparable;

import java.util.Comparator;

public class AgeSort implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {

		if (p1.getAge() > p2.getAge())
			return -1;
		if (p1.getAge() < p2.getAge())
			return p1.getLastName().compareTo(p2.getLastName());
		else
			return 0;
	}

}
