package maltithr;

public class Program2 {
	public static void main(String[] args) {
		Thread4 t1=new Thread4();
		System.out.println("Start");
		t1.setName("Thread");
		t1.start();
		
		Thread4 t2=new Thread4();
		System.out.println("Start");
		t2.setName("Muskan");
		t2.start();
		
		Thread4 t3=new Thread4();
		System.out.println("Start");
		t3.setName("Thread2");
		t3.start();
		
		Thread4 t4=new Thread4();
		System.out.println("Start");
		t4.setName("Output");
		t4.start();
		
		Thread4 t5=new Thread4();
		System.out.println("Start");
		t5.setName("Java");
		t5.start();
	}
	}

	class Thread4 extends Thread
	{
		public void run() {
			for(int i=1; i<=5; i++)
			{
				System.out.println(currentThread().getName()+" "+i);
			}
		}


}
