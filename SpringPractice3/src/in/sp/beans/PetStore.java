package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PetStore {
	
	@Value("Dog")
	public String petName;
	@Value("Ball")
	public String petToys;
	@Value("89.90")
	public float price;
	@Value("8")
	public int age;
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetToys() {
		return petToys;
	}
	public void setPetToys(String petToys) {
		this.petToys = petToys;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println("Pet Name :" + petName);
		System.out.println("Pet Toys : " + petToys);
		System.out.println("Pet Price : " + price);
		System.out.println("Pet Age : " + age);
	}
}
