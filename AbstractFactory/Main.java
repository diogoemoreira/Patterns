public class Main {
	public static void main(String[] args) {

		Factory fact = new Factory();

		FactInterface modernFact = fact.getFactory("modern");
		FactInterface simpleFact = fact.getFactory("simple");
		FactInterface victorianFact = fact.getFactory("victorian");
		
		Chair mchair = modernFact.createChair();
		Bed mbed = modernFact.createBed();
		Chair schair = simpleFact.createChair();
		Bed sbed = simpleFact.createBed();
		Chair vchair = victorianFact.createChair();
		Bed vbed = victorianFact.createBed();
		
		mchair.sitOn();
		mbed.sleepOn();
		schair.sitOn();
		sbed.sleepOn();
		vchair.sitOn();
		vbed.sleepOn();
	}
}
