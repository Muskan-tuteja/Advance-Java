package mltiple;


import java.util.LinkedList;

public class B {
	public static void main(String[] args) {
		LinkedList a= new LinkedList();
		System.out.println(a.isEmpty());
		a.add(7);
		a.add("Hello");
		a.add(true);
		a.add(9.0);
		a.add(3435465767L);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());

}
}
