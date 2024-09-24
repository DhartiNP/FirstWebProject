package startNew;

public class Circle_Abst extends Shape_Abst{
	//A=pi*2(r)
	//PM = 2*pi*r
	
	double radius;
	public Circle_Abst(double radius) {
		super();
		this.radius = radius;
	}
	@Override
	double calculateArea() {
		return Math.PI*radius*radius;
	}
	@Override
	double calculatePerimeter() {
		return 2*Math.PI*radius;
	}
	

	void show() {
		System.out.println("Show method using this keyword");
	}
	//invoke current class method using this keyword.
	void display() {
		this.show();
		System.out.println("display method using this keyword");
	}
	
	
	
}
