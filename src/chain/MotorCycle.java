package chain;

public class MotorCycle extends Vehicle implements VehicleInterface {

	private Boolean hasSideCar;
	
	@Override
	void transferOwnership(Person newOwner){
		
		
	}


	public Boolean getHasSideCar() {
		return hasSideCar;
	}


	public void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}
	
}
