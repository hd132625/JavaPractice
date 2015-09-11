package org.dimigo.inheritance;

public class Student extends Person{
	private String studentId;
	
	public Student(String name, int age, int height, int weight, String studentId) {
		super(name, age, height, weight);
		this.studentId = studentId;
	}
	
	public void study(){}
	public void eatSnack(){}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + super.name + ", age=" + super.age + ", height=" + super.height
				+ ", weight=" + super.weight + "]";
	}
	
}
