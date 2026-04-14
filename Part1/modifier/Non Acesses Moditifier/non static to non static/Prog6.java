class Prog6{
void m1(){
System.out.println("m1");
}
void m2(){
m1();
this.m1();
Prog6 obj = new Prog6();
obj.m1();

}
public static void main(String [] args){
Prog6 ob = new Prog6();
ob.m2();


}
}