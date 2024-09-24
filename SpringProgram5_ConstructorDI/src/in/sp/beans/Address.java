package in.sp.beans;

public class Address {
	private int homeNo;
	private String address1;
	private String zipCode;

	public Address(int homeNo, String address1, String zipCode) {
		super();
		this.homeNo = homeNo;
		this.address1 = address1;
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [homeNo=" + homeNo + ", address1=" + address1 + ", zipCode=" + zipCode + "]";
	}

}
