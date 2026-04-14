class Customer{
    public Customer(){
        System.out.println("I");
    }
    public Customer(int a){
        System.out.println("Am");
    }
    public Customer(int a,int b){
        System.out.println("Learning");
    }
    public Customer(char c){
        System.out.println("Java");
    }
    public static void main(String[] args) {
        Customer a1 = new Customer(5);
        Customer a2 = new Customer(87);
        Customer a3 = new Customer(765);
        Customer a4 = new Customer(76);
        Customer a5 = new Customer(6);
System.out.println(".................");

        Customer x1 = new Customer(43,3);
        Customer x2 = new Customer(445,3);
        Customer x3 = new Customer(43,38);
        Customer x4 = new Customer(4863,3);
        Customer x5 = new Customer(43,3866);
System.out.println(".................");

        Customer q1 = new Customer();
        Customer q2 = new Customer();
        Customer q3 = new Customer();
        Customer q4 = new Customer();
        Customer q5 = new Customer();
System.out.println(".................");

        Customer w1 = new Customer('g');
        Customer w2 = new Customer('g');
        Customer w3 = new Customer('j');
        Customer w4 = new Customer('j');
        Customer w5 = new Customer('k');
System.out.println(".................");
    }
}
    
