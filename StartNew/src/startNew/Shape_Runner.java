package startNew;

public class Shape_Runner {

	public static void main(String[] args) {
		
		double radius = 8.0;
		
		Circle_Abst circle = new Circle_Abst(radius);
		System.out.println("Area of Circle :" + circle.calculateArea());
		System.out.println("Perimeter of Circle : " + circle.calculatePerimeter());
		
		circle.display();
		
		double side3 = 4.3;
		double side2 = 5.3;
		double side1 = 9.0;
		Triangle_Abst triangle = new Triangle_Abst(side3, side2, side1);
		System.out.println("Area of Triangle : " + triangle.calculateArea());
		System.out.println("Perimeter of Triangle : " + triangle.calculatePerimeter());

		triangle.print(30);
	}

}
