public class ModernBed implements Bed {
	int mattress=0;
	
	public ModernBed() {
		//simple constructor
		this.mattress=1;
	}
	@Override
	public boolean hasMattress() {
		//confirms if it has mattress
		if(mattress>0) {
			return true;
		}
		return false;
	}

	@Override
	public void sleepOn() {
		//if the chair has legs then you can sit on it
		if(hasMattress()) {
			System.out.println("You can sleep on a Modern Bed");
		}
		else {
			System.out.println("You should add a mattress no?");
		}
	}
}
