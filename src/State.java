
public interface State {
	
	public void ignite(Vehicle vehicle);
	public void move(Vehicle vehicle);
	public void applyBrake(Vehicle vehicle);
	public void park(Vehicle vehicle);
	public void getState(Vehicle vehicle);
	
}	
