package two;

public class payment {
	void play() {
		System.out.println("Processing payment");
	}

}
class CreaditCard extends payment{
	void cardDetails() {
		System.out.println("Creadit car used");
	}
	public static void main(String[] args) {
		payment p = new CreaditCard();
		if(p instanceof CreaditCard) {
			CreaditCard c = (CreaditCard)p;
			
		
		c.play();

		
		//		p.play();
		c.cardDetails();
	}
	}
}
