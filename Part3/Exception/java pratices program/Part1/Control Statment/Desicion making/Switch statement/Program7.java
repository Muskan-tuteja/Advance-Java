class Program7 {

    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 20;
        int result;

        if (num1 > num2)
            result = 1;
        else if (num2 > num1)
            result = 2;
        else
            result = 3;

        switch (result) {

            case 1:
                System.out.println("Num1 is larger");
                break;

            case 2:
                System.out.println("Num2 is larger");
                break;

            case 3:
                System.out.println("Both are equal");
                break;
        }
    }
}
