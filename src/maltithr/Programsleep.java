package maltithr;

public class Programsleep {
	public static void main(String[] args) {
		Thread10 t1=new Thread10();
		
		t1.start();
	}
	}

	class Thread10 extends Thread
	{
	public void run() {
		for(int i=1; i<=5; i++)
		{
		try {
			System.out.println(Thread.currentThread().getName()+"Running:"+i);
			
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}	
	}


}
