// Wajp to check char is upercase lc or special char or digit char NP
package p6;
class Prog1
{
	protected static void check(char ch) {

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase");
        else if (ch >= '0' && ch <= '9')
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }

}
