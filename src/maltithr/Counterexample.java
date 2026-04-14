package maltithr;

public class Counterexample {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Thread t1 = new Thread(new Thread9(c));
		t1.start();
		
		Thread t2 = new Thread(new Thread9(c));
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c.count);
		
	}

}

class Thread9 implements Runnable{
	Counter c ;
	Thread9(Counter c){
		this.c=c;
	}
	@Override
	public void run() {
		for(int i =0;i<1000;i++) {
			c.inc();
			
		}
	}
}


