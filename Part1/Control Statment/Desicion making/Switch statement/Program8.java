class Program8 {

    public static void main(String[] args) {

        int num1 = 40;
        int num2 = 40;
        int result;

        if (num1 < num2)
            result = 1;
        else if (num2 < num1)
            result = 2;
        else
            result = 3;

        switch (result) {

            case 1:
                System.out.println("Num1 is Smaller");
                break;

            case 2:
                System.out.println("Num2 is Smaller");
                break;

            case 3:
                System.out.println("Both are equal");
                break;
        }
    }
}
