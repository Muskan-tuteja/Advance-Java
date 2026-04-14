package mltiple;

import java.util.Stack;


public class E {
	public static void main(String[] args) {
		Stack a= new Stack();
		System.out.println(a.isEmpty());
		a.add(7);
		a.add("Helloooooo");
		a.add(false);
		a.add(9.0);
		a.add(3435465767L);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());

}

}
