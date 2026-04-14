class AgeCategory {

    // static method
    static void printAgeCategory(String name, int age) {

        int category;

        if (age >= 0 && age <= 12)
            category = 1;
        else if (age <= 19)
            category = 2;
        else if (age <= 59)
            category = 3;
        else
            category = 4;

        System.out.println("Name: " + name);
        System.out.println("Category Number: " + category);
    }

    // non-static method
    void test() {
        // non-static calling static
        printAgeCategory("Muskan", 18);
 printAgeCategory("Muskan", 60);
 printAgeCategory("Muskan", 40);
    }

    public static void main(String[] args) {

        // object required to call non-static method
        AgeCategory obj = new AgeCategory();
        obj.test();
    }
}

