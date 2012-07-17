
public class StateMoving implements State {

	@Override
	public void ignite(Vehicle vehicle) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle is in Moving, So ignition is already ON");
	}

	@Override
	public void move(Vehicle vehicle) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle is already Moving");
		
	}

	@Override
	public void applyBrake(Vehicle vehicle) {
		// TODO Auto-generated method stub
		vehicle.setState(new StateHalted());
		System.out.println("Brakes are applied, Vehicle is halted.");
		
	}
		@Override
	public void getState(Vehicle vehicle) {
		// TODO Auto-generated method stub
		System.out.println("Current State is Moving");
	}

	@Override
	public void park(Vehicle vehicle) {
			// TODO Auto-generated method stub
		System.out.println("Cannot Park unless vehicle is halted");
	}

	

}
