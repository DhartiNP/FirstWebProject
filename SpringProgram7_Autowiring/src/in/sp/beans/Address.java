package in.sp.beans;

public class Address {
	private int homeNo;
	private String line1;
	private int zipCode;
	public void setHomeNo(int homeNo) {
		this.homeNo = homeNo;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	
	public String toString() {
		return "Address [homeNo=" + homeNo + ", line1=" + line1 + ", zipCode=" + zipCode + "]";
	}
	
	
	
	
}
