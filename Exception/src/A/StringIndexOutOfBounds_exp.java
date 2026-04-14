package A;

public class StringIndexOutOfBounds_exp {
//occurs when we access an index that is outside the string length.
	
	
	public static void main(String[] args) {
		     String s = "Java";

        System.out.println(s.charAt(10));   // index does not exist
    

        
//        Why this happens ?	 The string "Java" has only 4 characters. Valid index: 0 to 3. We tried to access index 10. So Java throws StringIndexOutOfBoundsException.
        
        
        
        
	}

}
