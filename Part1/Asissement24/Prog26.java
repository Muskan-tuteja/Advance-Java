class Prog26 {
    public static void main(String[] args) {

       int n = 4;
 int totalNumbers = n*(n+1)/2; // total numbers = 10
        int num = totalNumbers;       // start from last number

        for(int i = n; i >= 1; i--) {
// spaces
            for(int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(num);
num--;
            }
            System.out.println();
        }
    }
}
