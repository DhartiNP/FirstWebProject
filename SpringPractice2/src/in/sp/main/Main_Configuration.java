package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.PetStore;
import in.sp.resources.ApplicationConfiguration;


public class Main_Configuration {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		PetStore pet1 = (PetStore) context.getBean("petId1");
		pet1.display();
	}

}
