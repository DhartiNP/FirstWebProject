package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main_Annotation_XML {

	public static void main(String[] args) {
		
		String config_File = "/in/sp/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_File);
		
		Student std = (Student) context.getBean("student");
		std.display();
	}

}
