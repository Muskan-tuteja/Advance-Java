class Program1 {

    public static void main(String[] args) {

        char ch = 'A';

        switch (ch) {

            case 'A': case 'B': case 'C': case 'D': case 'E':
            case 'F': case 'G': case 'H': case 'I': case 'J':
            case 'K': case 'L': case 'M': case 'N': case 'O':
            case 'P': case 'Q': case 'R': case 'S': case 'T':
            case 'U': case 'V': case 'W': case 'X': case 'Y':
            case 'Z':
                System.out.println("Uppercase character");
                break;

            default:
                System.out.println("Not an uppercase character");
        }
    }
}
