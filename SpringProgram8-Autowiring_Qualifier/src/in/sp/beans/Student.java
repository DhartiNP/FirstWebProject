package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int id;
	private String name;
	
	@Autowired
	@Qualifier("addrObj2")
	private Address address;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("id : " + id);
		System.out.println("name : " + name);
		System.out.println("Address : " + address);
	}
	
}
