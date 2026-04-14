package HashTable;

import java.util.Hashtable;

public class HT1 {
	public static void main(String[] args) {
		Hashtable a= new Hashtable();
		System.out.println(a.isEmpty());
		a.put(1,3);
		a.put(2,"Hello");
	
	    System.out.println(a);
	    System.out.println(a.size());
	    a.put(1,true);
		a.put('a',false);
		a.put('b',"falses");
		a.put(3,null);
		a.put(4,null);
		 System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());

		

		}

}
