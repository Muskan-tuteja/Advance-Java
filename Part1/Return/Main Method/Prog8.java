class Prog8{
  public static void main(String[] args){
        boolean[] a = {true, false, true, false};
    System.out.println(a);
    System.out.println(a.length);
    System.out.println(a[3]);

    //System.out.println(a[9]);

 a[1] = true;
        a[2] = false;
        a[3] = true;

        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);  System.out.println(a);
  }
}