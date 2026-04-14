package throw_expn;

public class Try_catch {

	    public static void main(String[] args) {

	        try {
	            int a = 10;
	            int b = 0;

	            int result = a / b;  // Exception (divide by zero)
	            System.out.println(result);
	        } 
	        finally {
	            System.out.println("Finally block always executes");
	        }

	        System.out.println("Program ended");
	    }
}
