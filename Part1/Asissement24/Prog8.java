class Prog8 {
    public static void main(String[] args) {
        int n = 4;
        for(int i=n;i>=1;i--){
            char c='A';
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
