class Prog1{
void m1(){
System.out.println("m1");
}

static void m2(){
Prog1 obj = new Prog1();
obj.m1();
m1();}

void m3(){
System.out.println("m1");
m2();
}

}
public static void main(String [] args){
Prog1 o = new Prog1();
o.m2();
o.m3();

}
}
