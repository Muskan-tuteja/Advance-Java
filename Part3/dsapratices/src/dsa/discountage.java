package dsa;

import java.util.Scanner;

public class discountage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your total purchase");
		double total_purchase = sc.nextDouble();
		
		if(age>=13&&age<=19) {
			double teenage_disscount = total_purchase-(total_purchase*0.05);
			if(total_purchase<=5000) {
				System.out.println("Original Amount="+total_purchase);
				System.out.println("After disscount = "+teenage_disscount);
			}
			else if(teenage_disscount>5000) {
				double final_disscount= teenage_disscount-(teenage_disscount*0.05);
				System.out.println("Original Amount="+total_purchase);
				System.out.println("After disscount = "+final_disscount);
			}
		}
		
	}

}
