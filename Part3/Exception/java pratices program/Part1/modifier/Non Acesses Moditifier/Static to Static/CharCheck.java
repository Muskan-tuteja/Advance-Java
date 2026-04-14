class CharCheck {

    // static method
    static void checkChar(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is Uppercase letter");

        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is Lowercase letter");

        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is Digit");

        } else {
            System.out.println(ch + " is Special character");
        }
    }

    public static void main(String[] args) {

        //  Direct call
        checkChar('A');

        // Using class name (BEST)
        CharCheck.checkChar('m');

        // Using object reference (Not recommended)
        CharCheck obj = new CharCheck();
        obj.checkChar('#');
    }
}
