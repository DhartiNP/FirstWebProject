package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int id;
	private String name;

	@Autowired
	private Address address;

	@Autowired
	private Subjects subjects;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void display() {
		System.out.println("Student Id : " + id);
		System.out.println("Student Name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Subject list : " + subjects);
	}
}
