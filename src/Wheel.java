
public class Wheel implements Parts{
	
	int price;
	
	public Wheel(int i) {
		// TODO Auto-generated constructor stub
		price=i;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass());
	}

}
