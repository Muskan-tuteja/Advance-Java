class Prog6 {
    public static void main(String[] args) {
int n =4;
        for(int i=1;i<=n;i++){
char c='A';
            for(int j=1;j<=n;j++){
                if(j<=(n-i))
                    System.out.print(" ");
                else{
                    System.out.print(c);

                 c++;
}
            }
            System.out.println();
        }
    }
}
