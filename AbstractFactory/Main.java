public class Main {
	public static void main(String[] args) {
		FactInterface modernFact = new ModernFactory();
		FactInterface simpleFact = new SimpleFactory();
		FactInterface victorianFact = new VictorianFactory();
		
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
