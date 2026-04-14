package exception_Handling_trycatch;

import java.util.ArrayList;

public class IndexOutOfBounds_exp_handling {

	public static void main(String[] args) {
		   ArrayList<Integer> list = new ArrayList<>();
		   list.add(0);
		   list.add(20);
		   list.add(120);
		   list.add(5670);
		   
		   try {
			   System.out.println(list.get(5)); 
		   }
	        catch(IndexOutOfBoundsException i) {
	        	  System.out.println(i.getMessage());   // index does not exist
	        }
	        

	      
	    


	}


}
