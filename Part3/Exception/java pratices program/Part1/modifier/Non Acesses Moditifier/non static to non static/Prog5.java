class Prog5{
void m1(){
System.out.println("m1");
}
void m2(){
m1();
this.m1();
Prog5 obj = new Prog5();
obj.m1();
}
public static void main(String [] args){
Prog5 a = new Prog5();
a.m2();
}
}
