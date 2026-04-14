class Student
{
Student()//Constructor// return tyoe ni hota h 
{
System.out.println("Default Constructor");
}
Student (String name)
{
System.out.println(name);
}
Student ( int age)
{
System.out.println(age);
}
public static void main(String [] args){
new Student(); // Memmoy allocate karata hai (heap memory me)
new Student("Muskna");
}
}