package functionalinterface;

public class MainMethod {

	public static void main(String[] args) {
		
		//Normal process
		/*
		 * SoftwareEngineer se = new SoftwareEngineer(); se.getName();
		 */
		
		Employee selamda = ()-> "Software Engineer By Lamda";
		System.out.println(selamda.getName());
	}

}
