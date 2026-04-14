package Wrapper;

import java.util.ArrayList;

public class Demo3 {
	public static void main(String[] args) {
		ArrayList<Float> a= new ArrayList<Float>();
		System.out.println(a.isEmpty());
		a.add(7324324356f);
		a.add(7324356f);
		a.add(73243276f);
		a.add(24328434356f);
	    System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		for(Float x:a)
		{
			System.out.println(x);
		}
		

		}

}
