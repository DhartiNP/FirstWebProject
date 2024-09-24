package startNew;

public class Triangle_Abst extends Shape_Abst {
//a=1/2b*h
//PM = a+b+c
	double side3;
	double side1;
	double side2;
	int i =20;
	
	
	public Triangle_Abst(double side3,double side1, double side2) {
		super();
		this.side3 = side3;
		this.side1 = side1;
		this.side2 = side2;
	}
	@Override
	double calculateArea() {
		return (side1+side2+side3)/2;
	}
	@Override
	double calculatePerimeter() {
		return side1+side2+side3;
	}
	
	void print(int i) {
		System.out.println("print value of : " + super.i );
	}
	
	
	
	
}
