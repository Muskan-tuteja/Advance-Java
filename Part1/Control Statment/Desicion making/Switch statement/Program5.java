class Program5 {

    public static void main(String[] args) {

        int a = 10, b = 25, c = 15;
        int result;

        if (a > b && a > c)
            result = 1;
        else if (b > a && b > c)
            result = 2;
        else
            result = 3;

        switch (result) {
            case 1:
                System.out.println("A is largest");
                break;

            case 2:
                System.out.println("B is largest");
                break;

            case 3:
                System.out.println("C is largest");
                break;
        }
    }
}
