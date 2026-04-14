class Program4 { 

public static void main(String[] args) {
        char ch = 'B'; // test character

        if (ch < 'A' || ch > 'Z') {
            System.out.println(ch + " is not an uppercase alphabet");
        } else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is an uppercase vowel, not a consonant");
        } else {
            System.out.println(ch + " is an uppercase consonant");
        }
    }
}
