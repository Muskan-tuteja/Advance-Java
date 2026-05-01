package threads;

public class extenthread extends Thread {
	public void run() {
		for(int i =1;i>=10;i--) {
			System.out.println("extends class thread "+i);
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				
			}
		}
	}

}
