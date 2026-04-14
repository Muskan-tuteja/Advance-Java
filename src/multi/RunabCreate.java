package multi;

public class RunabCreate {
	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		Thread t3 = new Thread(r1);
		Thread t4 = new Thread(r1);
		Thread t5 = new Thread(r1);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread is running Runnable: " + Thread.currentThread().getName());
	}

}
