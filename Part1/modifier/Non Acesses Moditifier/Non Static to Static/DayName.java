// no -static to static calling

class DayName {

    // static method
    static void findDay(int day) {

        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day number");
        }
    }

    // non-static method
    void showDay() {
        // non-static → static (direct call)
        findDay(3);
 findDay(2);
    }

    public static void main(String[] args) {

        // object needed to call non-static method
        DayName obj = new DayName();

        // non-static method call
        obj.showDay();
    }
}

class DayName{
static void findDay(int day){
switch (day){
case 1: System.out.println("Monday");break;
case 2: System.out.println("Tuesday");break;
case 3: System.out.println("Wednesday");break;
case 4: System.out.println("Thursday");break;
case 5: System.out.println("Friday");break;
case 6: System.out.println("Saturday");break;
default:System.out.println("Invalid day number");
}
}
//non-static method
void showDay(){
finDay(2);
}
public static void main (String [] args){
DayName obj = new DayName()
obj.showDay()
}
}

