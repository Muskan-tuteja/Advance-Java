class User{
    public User(){
        System.out.println("Hii");
    }
    public User(int a){
        System.out.println("I");
    }
    public User(int a,int s){
        System.out.println("Am");
    }
    public User(char a){
        System.out.println("Mukan");
    }
    public static void main(String[] args) {
        User a1  = new User();
        User a2  = new User();
        User a3  = new User();
        User a4  = new User();
        User a5  = new User();
System.out.println(".................");

        User q1  = new User(43);
        User q2 = new User(56);
        User q3  = new User(785);
        User q4  = new User(66);
        User q5  = new User(8967);
System.out.println(".................");

        User w1  = new User(56,766);
        User w2  = new User(56,786);
        User w3  = new User(56,866);
        User w4  = new User(5,7866);
        User w5 = new User(56,78);
System.out.println(".................");

        User x1  = new User('d');
        User x2  = new User('d');
        User x3  = new User('d');
        User x4  = new User('d');
        User x5  = new User('d');
System.out.println(".................");
    }
}