package threads;

public class Consumer extends Thread {
	companysynch c;
	public Consumer(companysynch c){
		this.c=c;
	}
	public void run() {
		while(true) {
			this.c.cousume_item();
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				
			}
		}
	}

}
