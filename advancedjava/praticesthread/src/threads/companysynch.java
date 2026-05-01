package threads;

public class companysynch {
	int n ;
	boolean f =false;
//	f = false:chance:producer
//	f = true: chance:consumer
	synchronized public void produce_item(int n ) {
		if(f) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n=n;
		System.out.println("Proced " + this.n);
		f =true;
		notify();
	}
	synchronized public int cousume_item() {
		if(!f) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Coumsed" + this.n);
		f =false;
		notify();
		return this.n;
	}

}
