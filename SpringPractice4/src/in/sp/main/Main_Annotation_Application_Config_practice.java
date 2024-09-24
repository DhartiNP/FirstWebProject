package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.PetStore;

public class Main_Annotation_Application_Config_practice {

	public static void main(String[] args) {
		
	
		ApplicationContext context = new AnnotationConfigApplicationContext(PetStore.class);

		PetStore pet = (PetStore) context.getBean("petStore");
		pet.display();
	}

}
