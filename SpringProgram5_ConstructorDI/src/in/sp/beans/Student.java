package in.sp.beans;

public class Student {
	private int id;
	private String name;
	private Address address;

	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void display() {
		System.out.println("Student Id : " + id);
		System.out.println("Student Name : " + name);
		System.out.println("Student Address :" + address);
	}
}
