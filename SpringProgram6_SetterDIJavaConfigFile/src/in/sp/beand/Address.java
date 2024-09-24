package in.sp.beand;

public class Address {
	
	private int homeNo;
	private String address1;
	private String zipCode;
	
	public void setHomeNo(int homeNo) {
		this.homeNo = homeNo;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [homeNo=" + homeNo + ", address1=" + address1 + ", zipCode=" + zipCode + "]";
	}
	
	
}
