package exception_Handling_trycatch;

public class StringIndexOutOfBounds_exp_handling {

	public static void main(String[] args) {
	     String s = "Java";
	     
	     try {
	        System.out.println(s.charAt(10));   // index does not exist
	     }
	     catch(StringIndexOutOfBoundsException ss) {
	    	 
	     }
	     System.out.println("index does not exist");
	     
	}

}
