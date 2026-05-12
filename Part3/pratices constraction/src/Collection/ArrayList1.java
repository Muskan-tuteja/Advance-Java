package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> List = new ArrayList<>();
		List.add(2);
		List.add(3);
		List.add(4);
		List.add(5);
		System.out.println(List);
		List.add(45);
		System.out.println(List);
		
		List.remove(2);
		System.out.println(List);
		
//		add all
		ArrayList<Integer> List2= new ArrayList();
		List2.add(0344);
		List2.add(344);
		List2.add(5);
		
		List.addAll(List2);
		System.out.println(List);
		System.out.println(List2);
		List.removeAll(List2);
//		
		System.out.println(List);
		System.out.println(List.size());
		List2.clear();
		System.out.println(List2.size());
		
		
//		get and set
		ArrayList<String> List3 = new ArrayList<String>();
		List3.add("Muskan");
		List3.add("HARSH");
		List3.add("mahi");
		System.out.println(List3);
		System.out.println(List3.get(2));
		
		List3.set(0, "isga");
		System.out.println(List3);
//		container
		System.out.println(List3.contains("mahi"));
		
		
	}

}
