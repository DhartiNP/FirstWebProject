package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.PetStore;

public class Main_Annotation_Xml_practice {

	public static void main(String[] args) {
		
		String config_File = "/in/sp/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_File);

		PetStore pet = (PetStore) context.getBean("petStore");
		pet.display();
	}

}
