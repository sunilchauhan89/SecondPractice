
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Petrol Engine
	
		Chassis chassis=new Chassis(5245);
		Body body=new Body(5265);
		Door door=new Door(266);
		Window window=new Window(565);
		Steering steering=new Steering(2255);
		Wheel wheel=new Wheel(655);
		Tyre tyre=new Tyre(545);
		Light light=new Light(5548);
		Brake brake=new Brake(155);
		Battery battery=new Battery(568);
		EngineInterface engine=Engine.createEngine("petrol",4585);
		FuelTank fuelTank=new FuelTank(6285);
	
		
		System.out.println("**** CREATING FIRST VEHICLE ****\n");
		Vehicle car=new Car(chassis,body,door,window,steering,wheel,tyre,light,brake,battery,engine,fuelTank);
		car.EngineType();
		System.out.println("\n\n");
		
		// Changing States
		
		System.out.println("**** STATE DEMO ****\n");
		car.getState();
		car.applyBrake();
		car.ignite();
		car.applyBrake();
		car.move();
		car.applyBrake();
		car.applyBrake();
		car.park();
		System.out.println("\n\n");
		
		
		
		// Getting Total Price
		System.out.println("**** PRICE CALCULATION ****\n");
		System.out.println(car.getPrice());
		System.out.println("\n\n");
		
		// Diesel Engine
		System.out.println("**** CREATING SECOND VEHICLE ****\n");	
		Chassis chassis1=new Chassis(5245);
		Body body1=new Body(5265);
		Door door1=new Door(266);
		Window window1=new Window(565);
		Steering steering1=new Steering(2255);
		Wheel wheel1=new Wheel(655);
		Tyre tyre1=new Tyre(545);
		Light light1=new Light(5548);
		Brake brake1=new Brake(155);
		Battery battery1=new Battery(568);
		EngineInterface engine1=Engine.createEngine("diesel",4585);
		FuelTank fuelTank1=new FuelTank(6285);
	
		
		Vehicle dieselCar=new Car(chassis1,body1,door1,window1,steering1,wheel1,tyre1,light1,brake1,battery1,engine1,fuelTank1);
		dieselCar.EngineType();
		System.out.println("\n\n");
	}

}
