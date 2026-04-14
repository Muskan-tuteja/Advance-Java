package pratice;

public class Hierarch {
	void eat() {
		System.out.println("Hello");
	}
	public static void main(String [] args) {
		One s = new One();
		s.eat();
		s.eatss();
		 
		Two w = new Two();
		w.eat();
		w.eatsw();
		
		
		
	}


}
class One extends Hierarch{
	void eatss() {
		System.out.println("hii");
	}
}

class Two extends Hierarch{
	void eatsw() {
		System.out.println("hellp");
	}
	
}

