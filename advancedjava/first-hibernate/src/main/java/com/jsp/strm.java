package com.jsp;

import java.util.ArrayList;


import java.util.List;

public class strm {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(4);
		l.add(1);
		l.add(6);
		l.add(0);
		l.add(7);
		l.add(2);
		
			List<Integer> even = l.stream()
.filter(n-> n%2==0)
.toList();
			List<Integer> odd = l.stream()
					.filter(n-> n%2!=0)
					.toList();

System.out.println(even);
System.out.println(odd);
}

}
