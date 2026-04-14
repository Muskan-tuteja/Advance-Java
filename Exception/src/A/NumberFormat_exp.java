package A;

public class NumberFormat_exp {
	public static void main(String[] args) {
		 String s = "abc";   // not a number

	        int num = Integer.parseInt(s);   // converting to integer

	        System.out.println(num);
	        
	        
//	        Why this happens ?  "abc" is a String .   Integer.parseInt() expects a numeric string . Since "abc" is not a number, Java throws NumberFormatException . or NumberFormatException occurs when we try to convert a non-numeric string into a number.

	        
	        
	        
	}


}
