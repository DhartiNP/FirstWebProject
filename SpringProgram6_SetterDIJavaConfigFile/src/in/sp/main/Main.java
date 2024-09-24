package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beand.Student;
import in.sp.resources.SpringConfiguration;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration
				.class);
		Student std = (Student)context.getBean(Student.class);
		std.display();
	}

}
