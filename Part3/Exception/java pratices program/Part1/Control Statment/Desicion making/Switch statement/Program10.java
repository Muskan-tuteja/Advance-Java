class Program10 {

    public static void main(String[] args) {

        char ch = 'month';

        switch (ch) {

            case 'jan': 
            case 'feb':
            case 'mar':
            case 'apr':
            case 'may':
            case 'june':
            case 'july':
            case 'aug':
            case 'sep':
            case 'oct':
            case 'nov':
            case 'dec':

                System.out.println("month is name");
                break;

            default:
                System.out.println("Not an uppercase character");
        }
    }
}
