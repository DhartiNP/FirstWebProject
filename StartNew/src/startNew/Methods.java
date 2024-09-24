package startNew;

public class Methods {

	static void printHelloWorldTwise() {
		System.out.println("Hello world");
		System.out.println("Hello world");
	}

	void printFourStatments() {
		System.out.println("I've created my first variable");
		System.out.println("I've created my first method");
		System.out.println("I've created my first loop");
	}

	int a = 3;
	int b = 4;
	int sum = 0;

	int sumOfInteger(int a, int b, int c) {
		sum = a + b + c;
		return sum;

	}

	void printNumbers(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
	void printSquareOfNumbers(int n) {
		for(int i =1;i<=n;i++) {
			System.out.println(i*i);
		}
	}
	void multiplicationTable(int n) {
		for(int i =1;i<=10;i++) {
			System.out.printf("%d*%d=%d",n,i,i*n).println();
		}
	}
	void multiplicationTable(){
		for(int i =1;i<=10;i++) {
			System.out.printf("%d*%d=%d",5,i,i*5).println();
		}
	}
	int calculateThirdAngle(int angle1, int angle2) {
		int angle3 = 180-(angle1+angle2);
		return angle3;
	}
	int smallestNumber(int a, int b, int c) {
		int temp = Math.min(a, b);
		int smallestNumber = Math.min(c, temp);
		return smallestNumber;
	}
	int averageOfThreeNumbers(int a, int b , int c) {
		int average = (a+b+c)/3;
		return average;
	}
	

	public static void main(String[] args) {
		Methods methods = new Methods();
		Methods.printHelloWorldTwise();
		methods.printFourStatments();
		System.out.println(methods.sumOfInteger(3, 4,8));
		methods.printNumbers(5);
		methods.printSquareOfNumbers(5);
		methods.multiplicationTable(15);
		methods.multiplicationTable();
		System.out.println(methods.calculateThirdAngle(60, 50));
		System.out.println(methods.smallestNumber(32, 36, 8));
		System.out.println(methods.averageOfThreeNumbers(16, 24, 8));
	}

}
