//wajp to create a method it priniting the name, no of time based on age og a personP
class Prog1
{
	private static void print(String name, int age) {

        for (int i = 1; i <= age; i++) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        print("Muskan", 3);
    }
}
