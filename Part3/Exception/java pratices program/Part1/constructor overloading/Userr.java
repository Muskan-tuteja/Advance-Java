class Userr{
    String user;
    long password;
    public Userr(){
        System.out.println("Hii");
    }
    public Userr(int a){
        System.out.println("I");
    }
    public Userr(String a,long s){
        System.out.println("Am");
        user = a;
        password = s;
    }
    public Userr(char a){
        System.out.println("Muskan");
    }
    public static void main(String[] args) {
        Userr a1  = new Userr();
        Userr a2  = new Userr();
        Userr a3  = new Userr();
        Userr a4  = new Userr();
        Userr a5  = new Userr();

        Userr q1  = new Userr(43);
        Userr q2 = new Userr(56);
        Userr q3  = new Userr(785);
        Userr q4  = new Userr(66);
        Userr q5  = new Userr(8967);

        Userr w1  = new Userr("Abc@321",766);
        w1.user="Arredyy@5345";
        System.out.println(w1);
        System.out.println(w1.user);
        Userr w2  = new Userr("Hrg@48",786);
        Userr w3  = new Userr("Ashbv21423@",866);
        Userr w4  = new Userr("WDhnewu@38247",7866);
        Userr w5 = new Userr("dqwiu@24",78);

        Userr x1  = new Userr('d');
        Userr x2  = new Userr('d');
        Userr x3  = new Userr('d');
        Userr x4  = new Userr('d');
        Userr x5  = new Userr('d');
    }
}