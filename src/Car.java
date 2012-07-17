import java.util.ArrayList;


public class Car implements Vehicle {

	State carState=new StateParked();
	ArrayList<Parts> collection=new ArrayList<Parts>();
	
	
	
	public Car(Chassis chassis, Body body, Door door, Window window,
			Steering steering, Wheel wheel, Tyre tyre, Light light,
			Brake brake, Battery battery, EngineInterface engine,
			FuelTank fuelTank) {
		// TODO Auto-generated constructor stub
		collection.add((Parts) engine);
		collection.add(chassis);
		collection.add(body);
		collection.add(door);
		collection.add(window);
		collection.add(steering);
		collection.add(wheel);
		collection.add(tyre);
		collection.add(light);
		collection.add(brake);
		collection.add(battery);
		collection.add(fuelTank);
		
		
	}


	@Override
	public void setState(State state) {
		// TODO Auto-generated method stub
		this.carState=state;
	}


	@Override
	public void getState() {
		// TODO Auto-generated method stub
		carState.getState(this);
	}


	@Override
	public void ignite() {
		// TODO Auto-generated method stub
		carState.ignite(this);
	}


	@Override
	public void move() {
		// TODO Auto-generated method stub
		carState.move(this);
	}


	@Override
	public void applyBrake() {
		// TODO Auto-generated method stub
		carState.applyBrake(this);
	}


	@Override
	public void park() {
		// TODO Auto-generated method stub
		carState.park(this);
	}


	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		int price=0;
		for(int i=0;i<collection.size();i++)
		{
			price+=collection.get(i).getPrice();
		}
		return price;
	}


	@Override
	public void EngineType() {
		// TODO Auto-generated method stub
		System.out.println(collection.get(0).getClass());
	}

}
