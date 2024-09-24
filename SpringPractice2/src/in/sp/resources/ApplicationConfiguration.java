package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.PetStore;

@Configuration
public class ApplicationConfiguration {
	
	@Bean
	public PetStore petId1() {
		PetStore petId1 = new PetStore();
		petId1.setPetType("Dog");
		petId1.setPetToys("Ball");
		petId1.setPetPrice(110);
		return petId1;
		
	}
}
