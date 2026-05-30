package Program;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List user = new ArrayList<>();
		user.add("Muskan");
		user.add(234);
		user.add(67.998);
		user.add("A");
		System.out.println("All Users");
		
		for(Object users : user) {
			System.out.println(users);
		}
		
	}


}
