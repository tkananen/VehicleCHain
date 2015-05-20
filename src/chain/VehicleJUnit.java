package chain;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VehicleJUnit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVehicle() {
		Person a = new Person();
		Car testCar = new Car();
		Truck testTruck = new Truck();
		Person b = new Person();
		MotorCycle testMotorcycle = new MotorCycle();
		HashMap<UUID, Vehicle> testVehicleHash = new HashMap<UUID, Vehicle>();
		
		a.setPersonId(null);
		b.setPersonId(null);
		
		
		testCar.transferOwnership(a);
		testCar.setNumberofDoors(4);
		
		testTruck.transferOwnership(a);
		testTruck.setNumberOfAxels(2);
		testTruck.transferOwnership(b);
		
		testMotorcycle.setHasSideCar(false);
		
		testVehicleHash.put(a.getPersonId(), testCar);
		testVehicleHash.put(b.getPersonId(), testTruck);
		
		
		assertTrue(testTruck.getNumberOfAxels() == 2);
		assertTrue(testCar.getNumberofDoors() == 4);
		assertTrue(testMotorcycle.getHasSideCar() == false);
		
		assertTrue(testVehicleHash.size() == 2);
		
		
		
		
	}

}
