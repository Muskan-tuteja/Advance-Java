package Wrapper;

import java.util.ArrayList;

public class Demo5 {

	public static void main(String[] args) {
		ArrayList<Character> a= new ArrayList<Character>();
		System.out.println(a.isEmpty());
		a.add('A');
		a.add('B');
		a.add('C');
		a.add('D');
	    System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		int i =0;
		do {
//			System.out.println(a.get(3));
			System.out.println(a.get(i));
			i++;
		}
		while(i<a.size());
		

		}
}
