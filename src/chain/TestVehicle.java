package chain;

import java.util.HashMap;
import java.util.UUID;

public class TestVehicle {
	
	public static void main(String args[]) {
		Person a = new Person();
		Car car = new Car();
		Truck truck = new Truck();
		Person b = new Person();
		MotorCycle motorcycle = new MotorCycle();
		HashMap<UUID, Vehicle> vehicleHash = new HashMap<UUID, Vehicle>();
		
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
