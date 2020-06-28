public class SimpleFactory implements FactInterface{

	public SimpleFactory() {}
	@Override
	public Chair createChair() {
		//creates a Simple Chair
		return new SimpleChair();
	}

	@Override
	public Bed createBed() {
		// creates a Simple Bed
		return new SimpleBed();
	}

}
