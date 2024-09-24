package in.sp.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import in.sp.beans.Student;

@Configuration
public class SpringConfiguration {

	@Primary
	@Bean
	public Student stdId1() {
		Student stdId1 = new Student();
		stdId1.setRollNumber(20);
		stdId1.setName("Dharti");
		stdId1.setEmail("Dharti.patel@gmail.com");
		return stdId1;
	}

	@Bean
	public Student stdId2() {
		Student stdId2 = new Student();
		stdId2.setRollNumber(21);
		stdId2.setName("Divam");
		stdId2.setEmail("Divam.patel@gmail.com");
		return stdId2;

	}
	
	@Bean("stdId3Bean")
	public Student stdId3() {
		Student stdId3 = new Student();
		stdId3.setRollNumber(22);
		stdId3.setName("Diva");
		stdId3.setEmail("Diva.patel@gmail.com");
		return stdId3;

	}

}
