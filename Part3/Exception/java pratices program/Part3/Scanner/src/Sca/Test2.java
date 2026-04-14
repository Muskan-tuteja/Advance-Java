package Sca;
import java.util.Scanner;
public class Test2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter age:");
		
		int age = sc.nextInt();
		sc.nextLine();//clear buffer
		System.out.println("Enter Name:");
		String name = sc.nextLine();
		
		System.out.println("Enter address");
		String address = sc.next();
		sc.nextLine();
		
		System.out.println("Enter Double");
		float num = sc.nextFloat();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(num);
		
	}
	

}
