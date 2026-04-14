package LinjHaSe;

import java.util.LinkedHashSet;
import java.util.Stack;

public class LinkH1 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> a= new LinkedHashSet<Integer>();
		System.out.println(a.isEmpty());
		a.add(7);
		a.add(8);
		a.add(0);
		a.add(8);
		a.add(8);
		a.add(8);
		a.add(8);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		

		}

}
