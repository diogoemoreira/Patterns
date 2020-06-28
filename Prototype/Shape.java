public abstract class Shape {
	//Prototype abstract class
	int X,Y;
	String color;
	int id;
	private static int sid=0;
	
	public Shape() {
		this.id=++Shape.sid;
		this.X=1;
		this.Y=2;
		this.color="white";
	}
	protected Shape(Shape clonedShape) {
		this();
		this.color="black"; //cloned Shapes have a different color
		this.X = clonedShape.X;
		this.Y = clonedShape.Y;
	}
	
	public abstract Shape clone();
	
	public String toString() {
		return "ID:"+this.id+" X:"+this.X+" Y:"+this.Y+" Color:"+this.color;
	}
}
