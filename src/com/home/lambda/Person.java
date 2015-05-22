package com.home.lambda;

public class Person implements IPerson{
	private String name;
	private int age;
	
	public Person() {
    }

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public static int compareAge(Person p1,Person p2){
	    return ((Integer)p1.getAge()).compareTo(p2.getAge());
	}
	
	public int compareAges(Person p1,Person p2){
        return -((Integer)p1.getAge()).compareTo(p2.getAge());
    }

}
