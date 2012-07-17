
public class StateParked implements State {

	@Override
	public void ignite(Vehicle vehicle) {
		// TODO Auto-generated method stub
		vehicle.setState(new StateIgnited());
		System.out.println("Ignition is turnedOn");
	}

	@Override
	public void move(Vehicle vehicle) {
		// TODO Auto-generated method stub
		System.out.println("Turn on Ignition First to move vehicle");
		
	}

	@Override
	public void applyBrake(Vehicle vehicle) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle is halted, No use of applying Brakes");
	}

	@Override
	public void park(Vehicle vehicle) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle is alredy Halted");
	}

	@Override
	public void getState(Vehicle vehicle) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle is Parked");
	}

	
	

}
