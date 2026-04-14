package two;

interface Banks {
	void pay();
	

}
class CreditCard implements Banks{
	public void pay() {
		System.out.println("paid using credit");
	}
}

class UPI implements Banks{
	public void pay() {
		System.out.println("paid using upi");
	}
	public static void main(String[] args) {
		Banks p ;
		p = new CreditCard();
		p.pay();
		
		p = new UPI();
		p.pay();
		
		
	}
	
}
