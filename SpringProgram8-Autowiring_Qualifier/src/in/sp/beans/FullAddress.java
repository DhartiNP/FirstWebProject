package in.sp.beans;

public class FullAddress {
	private String line1;
	private String line2;
	private int streetNo;
	
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	
	
	@Override
	public String toString() {
		return "FullAddress [line1=" + line1 + ", line2=" + line2 + ", streetNo=" + streetNo + "]";
	}
	
	
	
	
}
