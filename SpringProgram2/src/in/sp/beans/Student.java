package in.sp.beans;

public class Student {
	public int rollNumber;
	public String name;
	public String email;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.println("Roll Number : " + rollNumber);
		System.out.println("Name : " + name);
		System.out.println("Email Id : " + email);
	}
	
}
