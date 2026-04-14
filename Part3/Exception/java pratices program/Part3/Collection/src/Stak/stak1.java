package Stak;

import java.util.ArrayList;
import java.util.Stack;

public class stak1 {
	public static void main(String[] args) {
		Stack<Integer> a= new Stack<Integer>();
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
