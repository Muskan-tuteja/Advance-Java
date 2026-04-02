package multi;

public class FileWritting {
	public static void main (String [] args) {
		System.out.println("main start");
		
		Thread1 tr = new Thread1();
//		tr.start();
		tr.run();
		System.out.println("main end");
	}

}

class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i =1;i<=10; i++)
			
			
			System.out.println(i);
	}
}


// runnable 
//sleep(milles)

// run = execute the run method
//islive()
//priporty= 
//set pripoty
//set neme()
//get name()
//join()
// start()
// 


