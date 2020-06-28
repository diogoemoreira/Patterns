public class Circle extends Shape{
	//Prototype class
	int radius;
	
	public Circle() {
		//simple constructor
		super(); //calls super contructor to initialize super attributes (X,Y,color,ID)
		this.radius=2;
		}
	
	public Circle(Circle C2) {
		super(C2); //calls super so super attributes are cloned
		this.radius=C2.radius;
	}
	
	@Override
	public Shape clone() {
		return new Circle(this); //return a new Circle with the same attributes as this one
	}
	
	@Override
	public String toString() {
		//Super toString plus Circle attributes
		return super.toString()+" radius:"+this.radius;
	}
}
