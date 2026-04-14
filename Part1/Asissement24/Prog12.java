class Prog12{
    public static void main(String[] args) {
int n =4;
char c=(char)('A' + n - 1);

        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                if(j<=n-i)
                    System.out.print(" ");
 
                else
                    System.out.print(c);
            }

            System.out.println();
  c--;

        }
    }
}
