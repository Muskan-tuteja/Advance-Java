package threads;

public class Produced extends Thread {
	
	companysynch c;
	public Produced(companysynch c){
		this.c=c;
	} 
	public void run()
	{
		int i =1;
		while(true) {
			this.c.produce_item(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
			i++;
		}
	}

}
