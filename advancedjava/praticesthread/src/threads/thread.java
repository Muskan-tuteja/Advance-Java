package threads;

public class thread implements Runnable {
	public void run() {
		for(int i=1; i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
	public static void main(String[] args) {
		//create object of Mythread class
		thread t1 = new thread();
		
		Thread thr = new Thread(t1);
		extenthread t2 = new extenthread();
//		t1.start();
		thr.start();
		t2.start();
	}

}
