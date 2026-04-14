class EvenOdd {

    // static method
    static void checkEvenOdd(int num) {

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    // non-static method
    void showResult() {
        // non-static → static (direct call)
        checkEvenOdd(10);
 checkEvenOdd(7);
    }

    public static void main(String[] args) {

        // object needed to call non-static method
        EvenOdd obj = new EvenOdd();

        // non-static method call
        obj.showResult();
    }
}

class EvenOdd{

static void CheckEvenOdd(int num){
if(num % 2 ==0){
System.out.println(num + " is Even");
}else{
System.out.println(num + " is odd");
}
}
//non-static method
void showResult(){
checkEvenOdd(10);

}

public static void main(String [] args);
EvenOdd obj = new EvenOdd()
obj.showResult()
}
}