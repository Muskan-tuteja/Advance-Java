class Program4 {
    // Properties of delivery boy
    String name;
    int age;
    char gender;
    String phoneNumber;
    String email;
    String address;
    String vehicleType;
    String vehicleNumber;
    double salary;
    boolean isAvailable;
    int experienceYears;
    String shiftTiming;
    String areaCovered;
    boolean hasDrivingLicense;
    String languageKnown;

    // Method to print details
    void printDetails() {
        System.out.println("Delivery Boy Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Salary: " + salary);
        System.out.println("Available: " + isAvailable);
        System.out.println("Experience (Years): " + experienceYears);
        System.out.println("Shift Timing: " + shiftTiming);
        System.out.println("Area Covered: " + areaCovered);
        System.out.println("Driving License: " + hasDrivingLicense);
        System.out.println("Languages Known: " + languageKnown);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create object and initialize
        DeliveryBoy db = new DeliveryBoy();
        db.name = "Rohit";
        db.age = 25;
        db.gender = 'M';
        db.phoneNumber = "9876543210";
        db.email = "rohit@example.com";
        db.address = "123, MG Road, Delhi";
        db.vehicleType = "Bike";
        db.vehicleNumber = "DL8S AB 1234";
        db.salary = 18000.50;
        db.isAvailable = true;
        db.experienceYears = 3;
        db.shiftTiming = "9 AM - 6 PM";
        db.areaCovered = "Delhi NCR";
        db.hasDrivingLicense = true;
        db.languageKnown = "Hindi, English";

        // Print all details
        db.printDetails();
    }
}
