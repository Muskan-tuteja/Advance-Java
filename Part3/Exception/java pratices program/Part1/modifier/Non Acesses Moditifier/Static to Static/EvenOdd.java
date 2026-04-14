class EvenOdd {

    // static method
    static void checkEvenOdd(int num) {

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    public static void main(String[] args) {

        // Direct call
        checkEvenOdd(10);

        //Using class name (BEST)
        EvenOdd.checkEvenOdd(7);

        //  Using object reference (Not recommended)
        EvenOdd obj = new EvenOdd();
        obj.checkEvenOdd(15);
    }
}
