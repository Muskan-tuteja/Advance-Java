package mltiple;

import java.util.ArrayList;

public class collec {
	
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(7);
		a1.add("Hy");
		a1.add(true);
		a1.add(9.0);
		a1.add(3435465767L);
//		a1.addAll(a1);
//		a1.remove(0);
//		a1.removeAll(a1);
		a1.retainAll(a1);
		
		System.out.println(a1);
	

}
}
