class Program1 {
    public static void main(String[] args) {
//print the factorial of 8
  int f = 8*7*6*5*4*3*2*1;
//print the factorial of 7
  int fac = 7*6*5*4*3*2*1;
//print the factorial of 4
  int facor = 4*3*2*1;
//Find the simple interest where principal amount is 8 lakhs;time 60 months,rate of interest is 12%.
//Principal = 8 lakh = 800000
//Time = 60 months = 5 years
//Rate = 12%
int P = 800000;
        int R = 12;
        int T = 5;   // 60 months = 5 years
        int SI = (P * R * T) / 100;
//what is the average of following number 40,30,56,78
        int avg = (40 + 30 + 56 + 78) / 4;
//6. Find the total marks and overall percentage of ashish,where
//marks in science is 78
//marks in Social science is 89
//marks in Math is 99
//marks in English is 88
//marks in Hindi is 67.Find mark of every in dividual subject is 100.

//Answer : Subjects = 5
//Full marks = 100 each → Total full marks = 500

 int total = 78 + 89 + 99 + 88 + 67;
        int percent = (total * 100) / 500;
        


 System.out.println(f);
System.out.println(fac);
System.out.println(facor);
  System.out.println(SI);
System.out.println(avg);
System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percent);

}
}
