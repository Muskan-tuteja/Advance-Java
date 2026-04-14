package mltiple;

import java.util.ArrayList;

public class A {
	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		System.out.println(a.isEmpty());
		a.add(7);
		a.add("Hy");
		a.add(true);
		a.add(9.0);
		a.add(3435465767L);
		a.addAll(a);
		a.remove(0);
		a.contains(7);
//		a.removeAll(a);
		a.contains(7);
		a.retainAll(a);
		System.out.println(a);	
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		

}
}
	
