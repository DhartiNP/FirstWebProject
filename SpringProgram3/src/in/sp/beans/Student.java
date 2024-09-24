package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component

public class Student {
	
	@Value("Dharti")
	public String name;
	
	@Value("101")
	public int rollNumber;
	
	@Value("45.43f")
	public float marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Roll Numbner : " + rollNumber);
		System.out.println("Marks : " + marks);
	
	}
}
