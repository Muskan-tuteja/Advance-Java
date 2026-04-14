class Program3 {

    // Method to check vowel or consonant
    public static void checkChar(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) { // alphabet check
            if (ch == 'a' || ch == 'A') {
                System.out.println(ch + " is a vowel");
            } else if (ch == 'e' || ch == 'E') {
                System.out.println(ch + " is a vowel");
            } else if (ch == 'i' || ch == 'I') {
                System.out.println(ch + " is a vowel");
            } else if (ch == 'o' || ch == 'O') {
                System.out.println(ch + " is a vowel");
            } else if (ch == 'u' || ch == 'U') {
                System.out.println(ch + " is a vowel");
            } else {
                System.out.println(ch + " is a consonant");
            }
        } else {
            System.out.println(ch + " is not an alphabet");
        }
    }

    public static void main(String[] args) {
        checkChar('b'); // lowercase consonant
        checkChar('E'); // uppercase vowel
        checkChar('1'); // not alphabet
    }
}
