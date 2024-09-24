package startNew;

public class XYZ extends Test{
	private static String name;

	//overriding method
	protected void show() {
		System.out.println("two XYZ");
	}
	
	
	public static void main(String args[]) {
		Test test = new Test();
		test.show();
	
		XYZ xyz = new XYZ();
		xyz.show();
		xyz.bark();
		xyz.bark(name);
	}
	
	// both bark is overloading methods
	void bark() {
		System.out.println("barking");
	}
	
	void bark(String name) {
		name= "dog";
		System.out.println("barking " + name);
	}
	
	
	
}
