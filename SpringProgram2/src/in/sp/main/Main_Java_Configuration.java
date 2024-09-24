package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;
import in.sp.resource.SpringConfiguration;


public class Main_Java_Configuration {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		/*Student std1 = (Student) context.getBean("stdId1");
		std1.display();*/
		
		Student std1 = context.getBean(Student.class);
		std1.display();
	
		Student std2 = new Student();
		std2 = (Student) context.getBean("stdId2");
		std2.display();
		
		Student std3 = new Student();
		std3 = (Student) context.getBean("stdId3Bean");
		std3.display();
		
	}

}
