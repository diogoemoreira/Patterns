public class VictorianFactory implements FactInterface{

	public VictorianFactory() {}
	@Override
	public Chair createChair() {
		//creates a Victorian Chair
		return new VictorianChair();
	}

	@Override
	public Bed createBed() {
		// creates a Victorian Bed
		return new VictorianBed();
	}

}
