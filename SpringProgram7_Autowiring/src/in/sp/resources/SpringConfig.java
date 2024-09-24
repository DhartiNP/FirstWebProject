package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConfig {

	@Bean
	public Address addrObj() {
		Address addr = new Address();
		addr.setHomeNo(110);
		addr.setZipCode(12345);
		addr.setLine1("Street One");
		return addr;
	}

	@Bean
	public Subjects subObj() {
		
		Subjects sub = new Subjects();
		List<String> sub_list = new ArrayList<>();
		sub_list.add("Java");
		sub_list.add("Python");
		sub_list.add("C#");
		sub.setSubjects(sub_list);
		return sub;
	}

	@Bean
	public Student stuObj() {
		Student std = new Student();
		std.setId(1);
		std.setName("Divam Nirav Patel");
		// std.setAddress(addrObj()); manual DI
		//std.setSubjects(subObj()); manual DI
		return std;
	}
}
