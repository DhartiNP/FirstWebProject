package collections;

public class TestJoinDemo extends Thread {
	static Thread mainthread;
	
	public void run() {
		try {
			//child thread is waiting for the main thread through main thread reference
			mainthread.join();
			for (int i = 1; i <= 5; i++) {
				System.out.println("Child Thread : " + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		mainthread = Thread.currentThread();
		TestJoinDemo join = new TestJoinDemo();
		join.start();
		//main thread is waiting for the child thread
		//join.join();
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Main Thread : " + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
