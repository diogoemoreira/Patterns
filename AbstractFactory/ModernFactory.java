public class ModernFactory implements FactInterface{
	
	public ModernFactory() {}
	@Override
	public Chair createChair() {
		//creates a Modern Chair
		return new ModernChair();
	}

	@Override
	public Bed createBed() {
		// creates a Modern Bed
		return new ModernBed();
	}

}
