
public class StateIgnited implements State {

	@Override
	public void ignite(Vehicle vehicle) {
		// TODO Auto-generated method stub
		System.out.println("Ignition is already ON");
	}

	@Override
	public void move(Vehicle vehicle) {
		// TODO Auto-generated method stub
		vehicle.setState(new StateMoving());
		System.out.println("Vehicle stated Moving");
	}

	@Override
	public void applyBrake(Vehicle vehicle) {
		// TODO Auto-generated method stub
		System.out.println("No use of Applying Brakes, Vehicle is not moving");
	}

	@Override
	public void park(Vehicle vehicle) {
		// TODO Auto-generated method stub
		System.out.println("Can not park Vehicle");
	}

	@Override
	public void getState(Vehicle vehicle) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle's ignition is ON");
	}

	
}
