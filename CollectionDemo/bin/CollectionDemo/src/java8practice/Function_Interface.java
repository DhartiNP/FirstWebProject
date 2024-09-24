package java8practice;

import java.lang.reflect.Array;
import java.security.Identity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function_Interface {

	public static void main(String[] args) {
		
		Function<String,Integer> function = x -> x.length();
		System.out.println(function.apply("Dharti Nirav Patel"));
		Function<String,String> function1 = x->x.substring(0,2);
		System.out.println(function1.apply("Dharti"));
		
		//andThen()
		Function<Integer,Integer> logic1 = s->2*s;
		Function<Integer,Integer> logic2 = s-> s*s*s;
		
		//System.out.println(logic1.andThen(logic2).apply(4)); // 2*4=8=> 8*8*8=512
		
		System.out.println(logic2.andThen(logic1).apply(4)); // 4*4*4=64=>64*2=128
		
		System.out.println(logic1.compose(logic2).apply(4));
		
		Function<String,String> identyFunction=  Function.identity();
		System.out.println(identyFunction.apply("Dharti"));
		
		
		Function<List<Student>,List<Student>> studentStartWithDiLetter = li-> {
			List<Student> result = new ArrayList<>();
			for(Student s : li) {
				if(function1.apply(s.getName()).equalsIgnoreCase("Di")) {
					result.add(s);
				}
			}
			return result;
		};
		 Student S1= new Student(1,"Diva");
		 Student S2= new Student(1,"Divam");
		 Student S3= new Student(1,"divisha");
		 Student S4= new Student(1,"Riva");
		 List<Student> students = Arrays.asList(S1,S2,S3,S4); 
		  
		 List<Student> filteresList = studentStartWithDiLetter.apply(students);
		 System.out.println(filteresList);
		 
	}

}
