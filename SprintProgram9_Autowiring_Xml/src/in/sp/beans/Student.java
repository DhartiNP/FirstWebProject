package in.sp.beans;

public class Student {
	private int id ;
	private String name ;
	private Address address;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Student Id : " + id);
		System.out.println("Student Name :" + name);
		System.out.println("Student Address : " + address);
	}
}
