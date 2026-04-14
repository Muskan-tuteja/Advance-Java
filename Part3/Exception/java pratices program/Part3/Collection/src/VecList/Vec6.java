package VecList;

import java.util.ArrayList;
import java.util.Vector;

public class Vec6 {
	public static void main(String[] args) {
		Vector<Boolean> a= new Vector<>();
		System.out.println(a.isEmpty());
		a.add(true);
		a.add(false);
		a.add(null);
	    System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		

		}

}
