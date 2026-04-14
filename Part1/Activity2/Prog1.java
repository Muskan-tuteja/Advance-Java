//Print all the digit of a number
class Prog1 {
    public static void main(String[] args) {

        int num = 5678;

        int d1 = num % 10;         
        int d2 = (num / 10) % 10;   
        int d3 = (num / 100) % 10; 
        int d4 = (num / 1000) % 10; 
     //Print Sum of all the digits of a number
       int sum = d1 + d2 + d3 + d4;
//print product of all the digits of a number
      int product = d1 * d2 * d3 * d4;
//print the sum all the even digits of a number
           int Sum = 0;

        Sum += d1 * (1 - d1 % 2);
        Sum += d2 * (1 - d2 % 2);
        Sum += d3 * (1 - d3 % 2);
        Sum += d4 * (1 - d4 % 2);
//print the sum of all the add digits of a number
           int Sum1 = 0;

        Sum1 += d1 * (d1 % 2);
        Sum1 += d2 * (d2 % 2);
        Sum1 += d3 * (d3 % 2);
        Sum1 += d4 * (d4 % 2);

//find square of a number (sqr of 4,sqr9)
     int Sqr = 4;
 int Sqr1 = 9;
  //find of cube of a number(Cubeof5,cube of 2,cube of 15)
int num1 = 5;
//find of 4th power of 5
 int power1 = 5;
//find of 6th power of 3
int power2 = 3;
//find of 2nd power of 6
int power3 = 6;
//find of 3rd power of 8
int power4 = 8;
//area of rectangle where length in 4cm and width is 5.6cm
   double l = 4, w = 5.6;
//perimeter of rectangle where length is 4.1m and width is 3.2cm
 double length = 4.1, width = 5.2;
//area and perimeter of a sequre where sides 6cm 
   int s = 6;
        
       
       



        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
       System.out.println("Sum = " + sum);
System.out.println("Product = " + product);
 System.out.println("Even digits sum = " + Sum);
System.out.println("Odd digits sum = " + Sum1);
 System.out.println(Sqr * Sqr);
System.out.println(Sqr1 * Sqr1);
 System.out.println(num1 * num1 * num1);
 System.out.println(power1 * power1 * power1 * power1);
 System.out.println(power2 * power2 * power2 * power2 * power2 * power2 );
 System.out.println(power3 * power3 );
 System.out.println(power4 * power4 * power4 );
 System.out.println("Area = " + (l * w));
 System.out.println("Perimeter = " + (2 * (length + width)));
System.out.println("Area = " + (s*s));
        System.out.println("Perimeter = " + (4*s));
    }
    }


