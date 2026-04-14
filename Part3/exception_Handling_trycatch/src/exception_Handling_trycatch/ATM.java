package exception_Handling_trycatch;

public class ATM {
	
	int pwd = 345;
	double balance = 34457;
	double limit = 20000;
	
	public void withdraw(double amount,int pwd) {
		if(this.pwd==pwd) {
			if(amount > limit) {
				try {
					throw new OutOfLimitException();
				}
				catch(OutOfLimitException o) {
					System.out.println(o.getMessage());
				}
				return;
			}
			if(this.balance>=balance) {
				this.balance-=balance;
				this.balance=this.balance-balance;
				System.out.println("collect the money");
			}
			else {
				System.out.println("insufficient balance");
				try {
					throw new insufficientBalence();
				}
				catch(insufficientBalence i)
				{
					System.out.println(i.getMessage());
					
				}
			}
		}
		else {
			try {
				throw new InvalidPwd();
				
			}
			catch(InvalidPwd i)
			{
				System.out.println(i.getMessage());
			}
		}
	}
	public static void main(String [] args) {
		ATM a = new ATM();
		a.withdraw(34457, 345);
		System.out.println(a.balance);
		a.withdraw(34457, 20000);
		System.out.println(a.balance);
		a.withdraw(10000, 20000);
		System.out.println(a.balance);
		a.withdraw(25000, 345);
		System.out.println(a.balance);
		
		
	}

}
