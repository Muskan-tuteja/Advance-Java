package dsa;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter total price: ");
        double total_price = sc.nextDouble();

        double final_price = total_price;

        // Teen discount
        if (age > 13 && age <= 19) {
            final_price = total_price - (total_price * 5.0 / 100);
        }

        // Extra discount if price > 1000
        if (total_price > 1000) {
            final_price = final_price - (final_price * 5.0 / 100);
        }

        System.out.println("Final Price: " + final_price);
    }
}