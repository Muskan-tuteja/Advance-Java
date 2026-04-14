package throw_expn;

public class Try_MultipleCatch_Finally {

	public static void main(String[] args) {
		  try {
	            int a = 10;
	            int b = 0;

	            int result = a / b;   
	            System.out.println(result);

	            String s = null;
	            System.out.println(s.length()); 

	        } 
	        catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero!");
	        } 
	        catch (NullPointerException e) {
	            System.out.println("String is null!");
	        } 
	        catch (Exception e) {
	            System.out.println("Some other exception occurred!");
	        }

	        System.out.println("Program ended....");
	   

	}

}