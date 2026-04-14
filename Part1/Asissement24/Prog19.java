class Prog19 {
    public static void main(String[] args) {

       int n = 4;

        for(int i = n; i >= 1; i--) {
 // spaces
            for(int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
