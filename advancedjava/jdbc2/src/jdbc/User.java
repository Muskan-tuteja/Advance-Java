package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.util.Scanner;

public class User {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "";
        String email = "";
        String password = "";

        boolean flag = true;
        
    	try {
			Class.forName("org.postgresql.Driver");	
			
			//Create a connection
			String url = "jdbc:postgresql://localhost:5432/userdatabase1";
			String username = "postgres";
			String password1 = "root";
			
			Connection connection = DriverManager.getConnection(url,username,password1);

        while (flag) {

            System.out.println("\n===== WELCOME TO USER PORTAL =====");
            System.out.println("1. Create Account");
            System.out.println("2. View Profile");
            System.out.println("3. Edit Profile");
            System.out.println("4. Delete Account");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {

                // Create Account
                case 1:

                    System.out.print("Enter Name : ");
                    name = sc.nextLine();

                    System.out.print("Enter Email : ");
                    email = sc.nextLine();

                    System.out.print("Enter Password : ");
                    password1 = sc.nextLine();

                    String query = "insert into users(name,email,password) values(?,?,?)";

                    PreparedStatement ps = connection.prepareStatement(query);

                    ps.setString(1, name);
                    ps.setString(2, email);
                    ps.setString(3, password1);

                    ps.executeUpdate();
                    System.out.println("Account Created Successfully !");
                    break;

                // View Profile
                case 2:

                    System.out.println("\n===== VIEW PROFILE =====");

                    if (name.equals("")) {
                        System.out.println("No Account Found !");
                    } else {
                        System.out.println("Name : " + name);
                        System.out.println("Email : " + email);
                    }

                    break;

                // Edit Profile
                case 3:

                    System.out.println("\n===== EDIT PROFILE =====");
                    System.out.println("1. Edit Name");
                    System.out.println("2. Edit Email");
                    System.out.println("3. Edit Password");

                    System.out.print("Enter Choice : ");
                    int choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {

                        case 1:

                            System.out.print("Enter New Name : ");
                            name = sc.nextLine();

                            System.out.println("Name Updated Successfully !");
                            break;

                        case 2:

                            System.out.print("Enter New Email : ");
                            email = sc.nextLine();

                            System.out.println("Email Updated Successfully !");
                            break;

                        case 3:

                            System.out.print("Enter New Password : ");
                            password1 = sc.nextLine();

                            System.out.println("Password Updated Successfully !");
                            break;

                        default:

                            System.out.println("Invalid Choice");
                    }

                    break;

                // Delete Account
                case 4:

                    name = "";
                    email = "";
                    password1 = "";

                    System.out.println("Account Deleted Successfully !");
                    break;

                // Exit
                case 5:

                    System.out.println("Exit Successfully !");
                    flag = false;
                    break;

                // Invalid Choice
                default:

                    System.out.println("Invalid Option !");
            }
        }

        connection.close();
        sc.close();

    } catch (Exception e) {

        System.out.println(e);
    }
}
}
