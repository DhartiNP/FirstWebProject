package java8practice;

import java.util.ArrayList;
import java.util.List;

public class Lamda_Expression implements Functional_Interface{

	public static void main(String[] args) {
		//Lamda_Expression lamda = new Lamda_Expression();
		Functional_Interface lamda = new Lamda_Expression();
		System.out.println(lamda.add(10,12));
		
		//using lamda expression
		Functional_Interface lamda1 = (int a, int b) -> {return a+b;};
		
		System.out.println(lamda1.add(12, 12));
		
		String_Functional_Interface lamda2= Obj-> {System.out.println("Hello " + Obj);};
		
		lamda2.sayHi("Dharti");
		
		Funcational_Interface3 lamda3 = () -> {System.out.println("Hello there");
		System.out.println("How are you");};
		lamda3.sayHello();
	}
	
	
	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

}
