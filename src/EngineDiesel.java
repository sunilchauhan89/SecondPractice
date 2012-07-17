
public class EngineDiesel extends Engine  {

	int price;
	public EngineDiesel(int i) {
		// TODO Auto-generated constructor stub
		price=i;
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	@Override
	public void getType() {
		// TODO Auto-generated method stub
		System.out.println("Diesel Engine");
	}
	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass());
	}
	
	
}
