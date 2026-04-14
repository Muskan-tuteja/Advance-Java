class Prog4{
void m1(){
System.out.println("m1");
}
void m2(){
m1();
this.m1();
Prog4 obj = new Prog4();
obj.m1();

}
public static void main(String [] args){
Prog4 p= new Prog4();
p.m2();


}
}