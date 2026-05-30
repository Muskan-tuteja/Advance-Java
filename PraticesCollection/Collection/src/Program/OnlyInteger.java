package Program;

import java.util.ArrayList;
import java.util.List;

public class OnlyInteger {
	public static void main(String[] args) {
		List <Integer>  users = new ArrayList();
//		users.add("Muskan");
		users.add(234);
		users.add(8755);
		users.add(8755);
		users.add(8755);
		System.out.println(users);
		System.out.println(users.get(2));
		System.out.println(users.addAll(users));
		
	}

}
