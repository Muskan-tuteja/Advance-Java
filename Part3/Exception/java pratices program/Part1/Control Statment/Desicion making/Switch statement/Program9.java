class Program9 {

    public static void main(String[] args) {

        int num = -5;
        int result;

        if (num > 0)
            result = 1;
        else if (num < 0)
            result = 2;
        else
            result = 3;

        switch (result) {

            case 1:
                System.out.println("Number is Positive");
                break;

            case 2:
                System.out.println("Number is Negative");
                break;

            case 3:
                System.out.println("Number is Zero");
                break;
        }
    }
}
