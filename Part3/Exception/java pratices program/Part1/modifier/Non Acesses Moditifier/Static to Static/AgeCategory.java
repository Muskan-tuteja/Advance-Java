class AgeCategory {

    // static method
    static void checkAge(String name, int age) {
        if(age >= 0 && age <= 12)
 System.out.println(name + " is a Child");
        else if(age <= 19)
 System.out.println(name + " is a Teenager");
        else if(age <= 59) 
System.out.println(name + " is an Adult");
        else 
System.out.println(name + " is a Senior Citizen");
    }

    public static void main(String[] args) {

        // Direct call
        checkAge("Muskan", 16);

        // Using class name
        AgeCategory.checkAge("Alice", 25);

        // Using object reference
        AgeCategory obj = new AgeCategory();
        obj.checkAge("Bob", 65);
    }
}
