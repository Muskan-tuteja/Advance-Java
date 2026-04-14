package Stak;

import java.util.ArrayList;
import java.util.Stack;

public class stak6 {
	public static void main(String[] args) {
		Stack<Boolean> a= new Stack<>();
		System.out.println(a.isEmpty());
		a.add(true);
		a.add(false);
		a.add(null);
	    System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		

		}

}
