package mltiple;


import java.util.TreeSet;

public class F {
	public static void main(String[] args) {
		TreeSet a= new TreeSet();
		System.out.println(a.isEmpty());
		a.add(7);
		a.add(3);
		a.add(6);
		a.add(7);
		a.add(3);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());

}

}
