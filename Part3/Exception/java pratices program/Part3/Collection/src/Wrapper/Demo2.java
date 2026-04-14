package Wrapper;

import java.util.ArrayList;

public class Demo2 {
	public static void main(String[] args) {
		ArrayList<Long> a= new ArrayList<Long>();
		System.out.println(a.isEmpty());
		a.add(7324324356L);
		a.add(7324324356L);
		a.add(73243274594356L);
		a.add(7324328434356L);
	    System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		for(Long x:a)
		{
			System.out.println(x);
		}
		

		}

}
