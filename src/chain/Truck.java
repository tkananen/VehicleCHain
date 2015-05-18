package chain;

public class Truck extends Vehicle implements VehicleInterface{

	private Integer NumberOfAxels;
	
	
	public Integer getNumberOfAxels() {
		return NumberOfAxels;
	}


	public void setNumberOfAxels(int numberOfAxels) {
		NumberOfAxels = numberOfAxels;
	}

	@Override
	void transferOwnership(Person newOwner){
		
		
	}
	
}
