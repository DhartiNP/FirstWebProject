package collections;

public class Thread_Methods {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Thread Main");
		System.out.println(Thread.currentThread().getName());

	}

}
