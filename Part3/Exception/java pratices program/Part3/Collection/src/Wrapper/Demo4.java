package Wrapper;

import java.util.ArrayList;

public class Demo4 {
	public static void main(String[] args) {
		ArrayList<Double> a= new ArrayList<Double>();
		System.out.println(a.isEmpty());
		a.add(2.78);
		a.add(3.7789);
		a.add(2.728);
		a.add(1.728);
		a.add(2.7358);
	
	    System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		//for Each
//		for(Double x:a)
//		{
//			System.out.println(x);
//		}
		
//		int i =0; 
//		while(i<a.size())
//		{
//			System.out.println(a.get(i));
//			i++;
//		}
		
		// do-while loop
		int i =0;
		do {
			System.out.println(a.get(3));
			System.out.println(a.get(i));
			i++;
		}
		while(i<a.size());
		
		

		}
	

}
