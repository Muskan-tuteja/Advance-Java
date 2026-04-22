package dsa;

import java.util.Scanner;

public class DiscountCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total puchase amount");
		double amount = sc.nextDouble();
		double discount = 0;

        if (amount > 1000) {
            discount = 20;
        } else if (amount > 500) {
            discount = 10;
        } else {
            discount = 5;
        }

        double discountAmount = (amount * discount) / 100;
        double finalPrice = amount - discountAmount;

        System.out.println("Discount: " + discount + "%");
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Price: " + finalPrice);

        sc.close();
    }
	

}
