package collections;

public class Thread_Runnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread using runnable interface");
	}

	public static void main(String[] args) {

		Thread_Runnable thread = new Thread_Runnable();
		Thread threadclass = new Thread(thread);
		threadclass.start();

	}

}
