class Prog27 {
    public static void main(String[] args) {

       int n = 4;
 int totalNumbers = n*(n+1)/2; // total numbers = 10
        int num = totalNumbers;       // start from last number

        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num);
num--;
            }
            System.out.println();
        }
    }
}
