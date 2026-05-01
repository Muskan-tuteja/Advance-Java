package threads;

public class Daemon {
	public static void main(String[] args) {
		companysynch comp = new companysynch();
		Produced p = new Produced(comp);
		Consumer c = new Consumer(comp);
		p.start();
		c.start();
	}

}
