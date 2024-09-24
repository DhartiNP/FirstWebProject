package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beand.Address;
import in.sp.beand.Student;


@Configuration
public class SpringConfiguration {
	
	@Bean
	public Address  createAddObj(){
		Address addr = new Address();
		addr.setHomeNo(101);
		addr.setAddress1("New address");
		addr.setZipCode("12345");
		
		return addr;
		
	}
	
	@Bean
	public Student createNewStudentObj() {
		Student std = new Student();
		std.setId(1);
		std.setName("Divam");
		std.setAddress(createAddObj());
		
		return std;
		
	}

	

}
