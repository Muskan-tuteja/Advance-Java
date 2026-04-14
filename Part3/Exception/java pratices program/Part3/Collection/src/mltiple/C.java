package mltiple;


import java.util.Vector;

public class C {
	public static void main(String[] args) {
		Vector a= new Vector();
		System.out.println(a.isEmpty());
		a.add(7);
		a.add("Hello");
		a.add(false);
		a.add(9.0);
		a.add(3435465767L);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());

}

}
