class Prog11 {
    public static void main(String[] args) {
        int n = 4;
          char c = (char)('A' + n - 1);

        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(c);
            }
            System.out.println();
            c--;
        }
    }
}
