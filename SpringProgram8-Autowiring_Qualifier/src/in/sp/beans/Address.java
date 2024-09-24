package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Address {
	private int homeNo;
	private int zipcode;
	
	@Autowired
	
	private FullAddress fulladdress;
	
	public void setHomeNo(int homeNo) {
		this.homeNo = homeNo;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	/*
	 * public void setFulladdress(FullAddress fulladdress) { this.fulladdress =
	 * fulladdress; }
	 */
	@Override
	public String toString() {
		return "Address [homeNo=" + homeNo + ", zipcode=" + zipcode + ", fulladdress=" + fulladdress + "]";
	}
	
	
}
