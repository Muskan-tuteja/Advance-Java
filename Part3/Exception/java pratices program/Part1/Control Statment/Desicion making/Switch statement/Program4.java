class Program4 {

    public static void main(String[] args) {

        char ch = '5';

        switch (ch) {

            case '0': case '1': case '2': case '3': case '4':
            case '5': case '6': case '7': case '8': case '9':
                System.out.println("Digit character");
                break;

            default:
                System.out.println("Not a digit character");
        }
    }
}
