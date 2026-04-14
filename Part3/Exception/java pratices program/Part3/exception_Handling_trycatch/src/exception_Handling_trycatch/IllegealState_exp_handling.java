package exception_Handling_trycatch;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public class IllegealState_exp_handling {
public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add("hy");
		a.add(true);
		a.add(7.3);
		
		System.out.println(a);
		
		ListIterator b = a.listIterator();
		
		try {
			b.remove();
		}
		catch(IllegalStateException n) {
			n.printStackTrace();
		}
		System.out.println("+++++++");

	}
	

}
