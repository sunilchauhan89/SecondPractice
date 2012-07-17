
public class StateHalted implements State {

	@Override
	public void ignite(Vehicle vehicle) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle is halted, So ignition is alredy ON");
	}

	@Override
	public void move(Vehicle vehicle) {
		// TODO Auto-generated method stub
		vehicle.setState(new StateMoving());
		System.out.println("Vehicle has started Moving");
	}

	@Override
	public void applyBrake(Vehicle vehicle) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle is already Halted, No use of applying Brakes");
	}

	@Override
	public void park(Vehicle vehicle) {
		// TODO Auto-generated method stub
		vehicle.setState(new StateParked());
		System.out.println("Vehicle is Parked.");
	}

	@Override
	public void getState(Vehicle vehicle) {
		// TODO Auto-generated method stub
		System.out.println("Currently Vehicle is Halted ");
	}

	

}
