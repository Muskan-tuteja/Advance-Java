package HashMapDeo;

import java.util.HashMap;

public class HM1 {
	public static void main(String[] args) {
		HashMap<Object, Object> a= new HashMap<>();
		System.out.println(a.isEmpty());
		a.put(1,3);
		a.put(2,"Hello");
		a.put(3,2.3);
		
	    System.out.println(a);
	    System.out.println(a.size());
	    a.put('u',true);
		a.put('a',false);
		a.put('b',null);
		a.put('A',null);
		a.put('p',8);
		a.put(3,0.3);
		
		 System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());

		

		}

}
