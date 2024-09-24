package collections;

public class Thread_Priority extends Thread{
	public void run() {
		
		
		System.out.println("Child Thread");
	}
	
	public static void main(String args[]) throws Exception {
		System.out.println("Main Thread Priority : " + Thread.currentThread().getPriority());
		Thread_Priority thread1 = new Thread_Priority();
		thread1.setPriority(6);
		thread1.start();
		System.out.println("Thread 1 Priority : " + thread1.getPriority());
		
		Thread_Priority thread2 = new Thread_Priority();
		thread2.setPriority(7);
		thread2.start();
		System.out.println("Thread 2 Priority : " + thread2.getPriority());
		
		thread2.sleep(2000);
		Thread_Priority thread3 = new Thread_Priority();
		thread3.setPriority(4);
		thread3.start();
		System.out.println("Thread 3 Priority : " + thread3.getPriority());
		
		
	}
}
