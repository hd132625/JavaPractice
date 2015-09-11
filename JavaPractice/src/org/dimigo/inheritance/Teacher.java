package org.dimigo.inheritance;

public class Teacher extends Person{
	public String subject;
	public Teacher(String name, int age, int height, int weight, String subject) {
		super(name, age, height, weight);
		this.subject = subject;
	}
	
	public void teach(){}
	public void doTask(){}

	@Override
	public String toString() {
		return "Teacher [subject=" + subject + ", name=" + super.name + ", age=" + super.age + ", height=" + super.height + ", weight="
				+ super.weight + "]";
	}
	
}
