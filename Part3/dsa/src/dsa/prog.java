package dsa;

import java.util.HashSet;
import java.util.Set;

public class prog {
//	substring
	public static void main(String [] args) {
		
		String a = "Programming world";
		
		String result = "";
		int maxLength = 0;
		for(int i =0;i<a.length();i++) {
			Set<Character> set = new HashSet<>();
			String word = " ";
			for(int j =i;j<a.length(); j++) {
				char c =a.charAt(j);
				if(set.contains(c)) {
					System.out.println(word);
					break;
				
				}
					set.add(c);
					word = word + c;
			
                if (word.length() > maxLength) {
                  maxLength = word.length();
                  result = word;
				
				
			}
			
		}
	}
		System.out.println("Longest substring: " + result);
      System.out.println("Length: " + maxLength);

}
}




//public class SubString_L_U {
//
//    public static void main(String[] args) {
//
//        String s = "Programming world";
//        int maxLength = 0;
//        String result = "";
//
//        for (int i = 0; i < s.length(); i++) {
//
//            Set<Character> set = new HashSet<>();
//            String word = "";
//
//            for (int j = i; j < s.length(); j++) {
//
//                char c = s.charAt(j);
//
//                if (set.contains(c)) {
//                    break;
//                }
//
//                set.add(c);
//                word = word + c;
//
//                if (word.length() > maxLength) {
//                    maxLength = word.length();
//                    result = word;
//                }
//            }
//        }
//
//        System.out.println("Longest substring: " + result);
//        System.out.println("Length: " + maxLength);
//    }
//}
