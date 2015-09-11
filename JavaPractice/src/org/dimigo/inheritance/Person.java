package org.dimigo.inheritance;

public class Person {
	public String name;
	public int age;
	public int height;
	public int weight;
	
	public Person(){}
	public Person(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public void eat(){}
	public void sleep(){}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
}
