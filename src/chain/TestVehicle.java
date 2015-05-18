package chain;

import java.util.HashMap;

public class TestVehicle {
	
	public static void main(String args[]) {
		Person a = new Person();
		Car car = new Car();
		Truck truck = new Truck();
		Person b = new Person();
		MotorCycle motorcycle = new MotorCycle();
		HashMap vehicleHash = new HashMap();
		
		car.transferOwnership(a);
		car.setNumberofDoors(4);
				
		truck.transferOwnership(a);
		truck.setNumberOfAxels(2);		
		truck.transferOwnership(b);
		
		motorcycle.setHasSideCar(false);
				
		vehicleHash.put(a.getPersonId(), car);
		vehicleHash.put(b.getPersonId(), truck);
		
		
		
		
	
	}

}
