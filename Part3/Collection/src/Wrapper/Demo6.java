package Wrapper;

import java.util.ArrayList;

public class Demo6 {
	public static void main(String[] args) {
		ArrayList<Boolean> a= new ArrayList<>();
		System.out.println(a.isEmpty());
		a.add(true);
		a.add(false);
		a.add(null);
	    System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		int i =0;
		do {
			System.out.println(a.get(3));
//			System.out.println(a.get(i));
			i++;
		}
		while(i<a.size());
		

		}

}
