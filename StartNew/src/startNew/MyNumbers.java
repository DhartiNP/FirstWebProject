package startNew;

public class MyNumbers {

	private int num;

	public MyNumbers(int num) {
		this.num = num;
	}

	public boolean isPrime() {
		for (int i = 2; i <= num-1; i++) {
			if (num %i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		MyNumbers number = new MyNumbers(6);
		System.out.println(number.isPrime());

	}

}
