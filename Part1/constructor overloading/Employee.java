class Employee{
    public Employee(){
        String name = "Muskan";
        String Address = "ABCD";
        String Study = "WED TECH";
        System.out.println(name+"\n"+Address+"\n"+Study);


    }
    public Employee(int a){
        String D_O_J = "1200";
        System.out.println(D_O_J);
    }
    public Employee(int a,int c){
        System.out.println("jiii");
    }
    public Employee(char a){
        System.out.println("hiii");
    }
    public static void main(String[] args) {
        Employee a1 = new Employee();
        Employee a2 = new Employee();
        Employee a3 = new Employee();
        Employee a4 = new Employee();
        Employee a5 = new Employee();
System.out.println(".................");

        Employee q1 = new Employee(3);
        Employee q2 = new Employee(36453455);
        Employee q3 = new Employee(3645);
        Employee q4 = new Employee(37);
        Employee q5 = new Employee(3785);
System.out.println(".................");

        Employee w1 = new Employee(3,97);
        Employee w2 = new Employee(3,7765);
        Employee w3 = new Employee(3,78895);
        Employee w4 = new Employee(3,7785);
        Employee w5 = new Employee(3,77885);
System.out.println(".................");

        Employee x1 = new Employee('a');
        Employee x2 = new Employee('f');
        Employee x3 = new Employee('h');
        Employee x4 = new Employee('k');
        Employee x5 = new Employee('u');
System.out.println(".................");

    }
}