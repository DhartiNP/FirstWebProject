package in.sp.resources;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import in.sp.beans.Address;
import in.sp.beans.FullAddress;
import in.sp.beans.Student;

@Configuration
public class SpringConfig {
	
	@Bean
	public FullAddress fullAddObj() {
		FullAddress fa = new FullAddress();
		fa.setLine1("Street Line 1");
		fa.setLine2("Street Line 2");
		fa.setStreetNo(495);
		return fa;
	}
	
	@Bean
	
	public Address addrObj1() {
		Address addr = new Address();
		//addr.setFulladdress(fullAddObj());
		addr.setHomeNo(102);
		addr.setZipcode(12345);
		return addr;
	}
	
	@Bean
	public Address addrObj2() {
		Address addr = new Address();
		//addr.setFulladdress(fullAddObj());
		addr.setHomeNo(103);
		addr.setZipcode(12345);
		return addr;
	}
	
	@Bean
	
	public Student stdObj() {
		Student std = new Student();
		std.setId(1);
		std.setName("Diva Nirav Patel");
		return std;
	}
	
	@Bean
	@Primary
	public Student stdObj1() {
		Student std = new Student();
		std.setId(1);
		std.setName("Divam Nirav Patel");
		return std;
	}
	
}
