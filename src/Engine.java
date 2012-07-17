
public abstract class Engine implements EngineInterface,Parts {

	
	
	public static EngineInterface createEngine(String string, int i) {
		// TODO Auto-generated method stub
		
		if(string=="petrol")
			return new EnginePetrol(i);
		else
			return new EngineDiesel(i);
		
	}

}
