package java8practice;

public class Main_Class {
	static int i =10;

	public static void doSomething() {
	
		AnonymousClassInterface sportInterface = ()-> {
		int i=20;
		};
	}
	
	public static void main(String[] args) {
		//constructor of normal class
		/*
		 * Sports sport = new Sports(); sport.run();
		 */
		
		AnonymousClassInterface sportInterface = new AnonymousClassInterface() {
			
			@Override
			public void run() {
				
				System.out.println("Student can get extra marks to run");
				
			}
		};
		sportInterface.run();
	}
}
