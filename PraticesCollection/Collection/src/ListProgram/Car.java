package ListProgram;

import java.util.ArrayList;
import java.util.List;

public class Car {
	String brand;
	
	Car(String brand){
		this.brand = brand;
		
	}
	public static void main(String[] args) {
		
		Car car1 = new Car("Toyata");
		Car car2 = new Car ("Ford");
		
		List<Car> CarList = new ArrayList();
		CarList.add(car1);
		CarList.add(car2);
		
		System.out.println("all the cars");
		for(Car car : CarList) {
			System.out.println(car.brand);
			
		}
		
	}

}
