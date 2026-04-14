class Program5 { 

public static void main(String[] args) {
        char ch = 'b'; // test character

        if (ch < 'a' || ch > 'z') {
            System.out.println(ch + " is not a lowercase alphabet");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a lowercase vowel, not a consonant");
        } else {
            System.out.println(ch + " is a lowercase consonant");
        }
    }
}
