package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class UserManagemetDemo {
	public static void main(String[] args) {
//		Set<String > user1Role = new HashSet<>(Arrays.asList("ADMIN", "USER"));
//		User user1 = new User("muskan",true,user1Role);
//		
		List<User> users = new ArrayList();
		users.add(new User("muskan",true,new HashSet<>(Arrays.asList("ADMIN", "USER"))));
	
		users.add(new User("mahi",false,new HashSet<>(Arrays.asList("USER"))));
		
		users.add(new User("mahi123",true,new HashSet<>(Arrays.asList("MANAGER"))));
	
//	Remove inactive users
		
		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext()) {
			if(!iterator.next().isActive())
				iterator.remove();
		}
		System.out.println("ACTIVE USER");
		
		for(User user : users)
			System.out.println(user.getName());
	}

}
