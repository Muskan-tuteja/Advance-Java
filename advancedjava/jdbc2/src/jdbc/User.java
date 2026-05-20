package jdbc;

import java.util.Scanner;

public class User {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while (flag) {

            System.out.println("Welcome to Created Account");
            System.out.println("Enter Choice:");
            System.out.println("Enter 1.Create Account");
            System.out.println("Enter 2.Edit Account");
            System.out.println("Enter 3.View Profile");
            System.out.println("Enter 4.Delete Account");
            System.out.println("Enter 5.Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Welcome to Account Created");
                    break;

                case 2:
                    System.out.println("Welcome to Edit Name");
                    break;

                case 3:
                    System.out.println("Welcome to Viewed Profile");
                    break;

                case 4:
                    System.out.println("welcome to Deleted Account");
                    break;

                case 5:
                    System.out.println("Exit Successfully");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}