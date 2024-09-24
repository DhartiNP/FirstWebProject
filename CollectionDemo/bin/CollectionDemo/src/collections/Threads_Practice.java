package collections;

public class Threads_Practice extends Thread{
	//this method run 2 times as 2 threads are created
	public void run() {
		System.out.println("Thread run method");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("New thread");
	}
	
	public static void main(String[] args) {
		Threads_Practice thread = new Threads_Practice();
		thread.start();
		
		thread.setName("Thread after changing name for thread");
		
		Threads_Practice thread1 = new Threads_Practice();
		thread1.start();
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(thread.isAlive());
		System.out.println(Thread.currentThread().getName());

	}

}
