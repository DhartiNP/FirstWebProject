package in.sp.beans;

public class PetStore {

	public String petType;
	public String petToys;
	public int petPrice;
	
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public String getPetToys() {
		return petToys;
	}
	public void setPetToys(String petToys) {
		this.petToys = petToys;
	}
	public int getPetPrice() {
		return petPrice;
	}
	public void setPetPrice(int petPrice) {
		this.petPrice = petPrice;
	}
	
	public void display() {
		System.out.println("Pet Type : " + petType);
		System.out.println("Pet Toys : " + petToys);
		System.out.println("Pet Price : " + petPrice );
	}
	
	
}
