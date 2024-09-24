package startNew;

public class Rectangle extends Shape {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle.getArea(4.89, 3.98));

		Shape shape = new Shape();
		{ // create obj of parent class and try to call method then method need to use
			// static keyword
			//System.out.println(getArea(3.23, 4.00));
		}
	}

	public double getArea(double length, double width) {
		super.getArea(length, width);
		return length * width;
	}

}
