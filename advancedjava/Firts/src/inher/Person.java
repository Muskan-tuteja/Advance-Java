package inher;

public class Person {
    String name = "Muskan";
    
    void showName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    void studentName() {
        System.out.println("Student name: " + name);
    }
}

class CollegeStudent extends Student {
    void college() {
        System.out.println("College student: " + name);
    }

    public static void main(String[] args) {
//        CollegeStudent c1 = new CollegeStudent();
   	Student c1 = new Student();
//    	Person c1 = new Person();
//        c1.college();
        c1.studentName();
        c1.showName();
    }
}