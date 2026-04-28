package dsa;

import java.util.Scanner;

public class Electricity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you unit");
		double total = 0;
		
		int unit = sc.nextInt();
		if(unit<=100) {
			total = unit*2;
			
		}
		else if(unit>=101 && unit<=300) {
			total = unit*4;
		}
		else if(unit>=300) {
			total=unit*6;
		}
		
	}

}
