package throw_expn;

public class issufficientBalance {
	  public static void main(String[] args) {

	        try {
	            // Directly throwing exception (no if)
	            throw new InsufficientBalanceException();

	        } 
	        catch (InsufficientBalanceException e) {
	            System.out.println(e.getMessage());
	        }

	        System.out.println("Program continues...");
	    }
}
