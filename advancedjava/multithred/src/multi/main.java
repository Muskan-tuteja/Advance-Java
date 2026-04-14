package multi;

public class main {
 
	public static void main(String [] args) {
		System.out.println("main start");
		Thread2 tr = new Thread2();
		tr.start();
		
	}

}
class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i =1;i<=10; i++)
			
			
//			System.out.println(i);
			System.out.println(currentThread().getName()+"="+i);
	}
}
