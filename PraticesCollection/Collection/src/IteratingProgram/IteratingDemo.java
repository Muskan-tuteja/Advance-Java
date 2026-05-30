package IteratingProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingDemo {
	public static void main(String[] args) {
		List<String> users = new ArrayList();
		users.add("Muskan");
		users.add("Mahi");
		
		
//		For each
		System.out.println("FOR EACH LOOP ADD");
		
		for(String user : users) 
			System.out.println("User : " + user);
			
//		For Loop
		System.out.println("Using For Loop");
		for(int i = 0; i<users.size(); i++) {
			System.out.println(users.get(i));
			
//			Iterator
			System.out.println("Iterator user ...");
			Iterator<String> it = users.iterator();
			while(it.hasNext()) {
				
				System.out.println(it.next());
			}
			
		}
	}

}
