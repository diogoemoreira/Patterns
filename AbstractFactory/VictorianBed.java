public class VictorianBed implements Bed {
	int mattress=0;
	
	public VictorianBed() {
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
			System.out.println("You can sleep on a Victorian Bed");
		}
		else {
			System.out.println("You should add a mattress no?");
		}
	}

}
