//Static to Static WAJP to craete a method to find the area recenglar
class Rectangle {

    // static variables
    static int length = 10;
    static int width = 5;

    // static method to calculate area
    static void findArea() {
        int area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }

    public static void main(String[] args) {
        // calling static method
        findArea(); 
//(CLASS NAME)
       Rectangle.findArea();

        // Using object reference (Not recommended)
        Rectangle obj = new Rectangle();
        obj.findArea();
    }
}

class Rectangle{
//static Varibles
static int length =10;
static int width = 5;

//ststic method to calculate area
static void findArea(){
int area = length*width;
System.out.println(Area of Rectangle = " +area);
}
public static void main (String[] args){
//calling static method
findArea();
//class name calling
Rectangle.findArea();
//using Object reference
Rectangle obj = new Rectangle();
obj.findArea();
}
}


