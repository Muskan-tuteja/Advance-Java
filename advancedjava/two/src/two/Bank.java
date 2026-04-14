package two;

public class Bank {
	void interestRate() {
		System.out.println("generic bank interest");
	}

}
class HBFC extends Bank{
	@Override
	void interestRate() {
		System.out.println("Hdfc interest rate ");
	}
}
class SBI extends Bank{
	@Override
	void interestRate() {
		System.out.println("sbi interest");
	}
	public static void main(String[] args) {
		Bank b;
		b = new HBFC();
		b.interestRate();
		
		b = new SBI();
		b.interestRate();
	}
}
