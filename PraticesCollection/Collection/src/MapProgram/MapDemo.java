package MapProgram;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map <Integer,String> users = new HashMap<Integer, String>();
		users.put(1, "Muskan");
		users.put(2, "Mahi");
		users.put(3, "Hashi");
		
		System.out.println(users);
		System.out.println(users.get(2));
		System.out.println("All user");
		
	}

}
