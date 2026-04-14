/*class Rectangle{
//static variables
static int length = 10;
static int width =5;

//static method to find area
static void findArea(){
int area = length*width;
System.out.println("Area of Rectangle = " +area);
}

//non-static method
void showArea(){
//calling static method from non-static method
findArea();
}
public static void main(String [] args){
//object needed to call non-static method
Rectangle obj = new Rectangle();

//non-static -> static 
obj.showArea();
}
}*/







/*class Rectangle{
//static variable
static int length = 10;
static int width = 5;

//static method
static void findArea(){
int area = length*width
System.out.println("Area of Rectangle = " +area);
}
//non-static method
void ShowArea(){
findArea()
}
public static void main(String [] args){
Rectangle obj = new Rectangle()

obj.ShowArea()
}
}*/
class R{
int l =10;
int b =5;
void findArea(){
int area = l*b;
System.out.println(area);
}
public static void main(String [] args){
R.findArea();
}
}
