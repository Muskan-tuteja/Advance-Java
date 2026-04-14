class Emp{
    public Emp(){
        String name = "Muskan";
        String Address = "ABC";
        System.out.println(name+"\n"+Address);
    }
    public Emp(int a){
        String D_O_J = "2006";
        System.out.println(D_O_J);
    }
    public Emp(int a,int c){
        System.out.println("jiii");
    }
    public Emp(char a){
        System.out.println("hiii");
    }
    public static void main(String[] args) {
        Employee a1 = new Employee();
        Employee a2 = new Employee();
        Employee a3 = new Employee();
        Employee a4 = new Employee();
        Employee a5 = new Employee();

        Employee q1 = new Employee(3);
        Employee q2 = new Employee(3767);
        Employee q3 = new Employee(3645);
        Employee q4 = new Employee(37);
        Employee q5 = new Employee(3785);

        Employee w1 = new Employee(3,97);
        Employee w2 = new Employee(3,7765);
        Employee w3 = new Employee(3,78895);
        Employee w4 = new Employee(3,7785);
        Employee w5 = new Employee(3,77885);

        Employee x1 = new Employee('a');
        Employee x2 = new Employee('f');
        Employee x3 = new Employee('h');
        Employee x4 = new Employee('k');
        Employee x5 = new Employee('u');

    }
}