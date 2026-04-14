class Student{
    public Student(int a){
        String name = "Muskan";
        System.out.println(name);
    }
    public Student(int a,int b){
        String Degree = "B.tech";
        System.out.println(Degree);
    }
    public Student(){
        long phone_no = 123456778;
        System.out.println(phone_no);
    }
    public Student(String a){
        System.out.println("Hii");
    }
    public static void main(String[] args) {
        Student a1 = new Student(5);
        Student a2 = new Student(87);
        Student a3 = new Student(765);
        Student a4 = new Student(76);
        Student a5 = new Student(6);
System.out.println(".................");

        Student x1 = new Student(43,3);
        Student x2 = new Student(445,3);
        Student x3 = new Student(43,38);
        Student x4 = new Student(4863,3);
        Student x5 = new Student(43,3866);
System.out.println(".................");

        Student q1 = new Student();
        Student q2 = new Student();
        Student q3 = new Student();
        Student q4 = new Student();
        Student q5 = new Student();
System.out.println(".................");
        Student w1 = new Student("a");
        Student w2 = new Student("ad");
        Student w3 = new Student("jhga");
        Student w4 = new Student("jha");
        Student w5 = new Student("ahu");
System.out.println(".................");
    }
}