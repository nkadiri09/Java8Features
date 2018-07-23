package com.naren.kadiri.comparatorvsComparable;

public class Person implements Comparable<Person> {

	private String firstName;
	private String lastName;
	private int rollNo;
	private int age;

	public Person() {
	}

	public Person(String firstName, String lastName, int rollNo, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", rollNo=" + rollNo + ", age=" + age
				+ "]";
	}

	@Override
	public int compareTo(Person o) {

		return this.getLastName().compareTo(o.getLastName());
	}

}
