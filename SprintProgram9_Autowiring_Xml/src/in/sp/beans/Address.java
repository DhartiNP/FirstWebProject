package in.sp.beans;

public class Address {
	private int homeNo;
	private String addressLine;
	private int zipCode;
	
	public void setHomeNo(int homeNo) {
		this.homeNo = homeNo;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [homeNo=" + homeNo + ", addressLine=" + addressLine + ", zipCode=" + zipCode + "]";
	}
	
	
}
