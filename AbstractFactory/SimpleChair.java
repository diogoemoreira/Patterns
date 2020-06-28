public class SimpleChair implements Chair {
	int legs=0;
	
	public SimpleChair() {
		//simple constructor
		this.legs=4;
	}
	@Override
	public boolean hasLegs() {
		//confirms if the Chair has legs
		if(legs>0) {
			return true;
		}
		return false;
	}

	@Override
	public void sitOn() {
		//if the chair has legs then you can sit on it
		if(hasLegs()) {
			System.out.println("You sat on a Simple Chair");
		}
		else {
			System.out.println("You should create a chair with legs no?");
		}
	}
}
