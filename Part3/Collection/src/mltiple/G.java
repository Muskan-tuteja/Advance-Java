package mltiple;

import java.util.HashSet;


public class G {
	public static void main(String[] args) {
		HashSet a= new HashSet();
		System.out.println(a.isEmpty());
		a.add(7);
		a.add("Heloo90");
		a.add(false);
		a.add(9.090);
		a.add(3435465767L);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());

}

}
