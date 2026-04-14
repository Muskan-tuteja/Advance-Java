
class R {
    static void m1() {
        System.out.println("m1");
    }

    void m2() {
        m1();
        this.m1();
        R obj = new R();
        obj.m1();
    } 
public static void main(String [] args){
 R r = new R();  // object create
        r.m2(); 
}
}
