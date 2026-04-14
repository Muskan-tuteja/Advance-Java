// Wajp to check char is upercase lc or special char or digit char NP
class Prog6
{
	private static void check(char ch) {

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase");
        else if (ch >= '0' && ch <= '9')
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }

    public static void main(String[] args) {
        check('@');
    }
}
