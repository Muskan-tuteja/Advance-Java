class Prog16 {
    public static void main(String[] args) {

        int n = 4;
        char c = 'A';
        // pehle total letters calculate kar lo
        int totalLetters = n*(n+1)/2; // 4*5/2 = 10
        c = (char)('A' + totalLetters - 1); // last letter J


        for(int i = n; i >= 1; i--) {

          
            for(int s = 1; s <= n - i; s++) {
               
            }

            // alphabets
            for(int j = 1; j <= i; j++) {
                System.out.print(c);
                c--;
            }

            System.out.println();
        }
    }
}
