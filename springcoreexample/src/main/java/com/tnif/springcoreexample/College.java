package com.tnif.springcoreexample;

public class College {
	//referance variable
	private Student student;
	public College() {
		System.out.println("College object created...");
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void show() {
		System.out.println("welcome to college");
		student.display();
		
	}
	

}
