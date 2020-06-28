public class Rectangle extends Shape{
	//Prototype class
	int width;
	int height;
	
	public Rectangle() {
		//simple constructor
		super(); //calls super contructor to initialize super attributes (X,Y,color,ID)
		this.width=1;
		this.height=1;
		}
	
	public Rectangle(Rectangle R2) {
		super(R2); //calls super so super attributes are cloned
		this.width=R2.width;
		this.height=R2.height;
	}
	
	@Override
	public Shape clone() {
		return new Rectangle(this); //return a new Rectangle with the same attributes as this one
	}
	
	@Override
	public String toString() {
		//Super toString plus Rectangles attributes
		return super.toString()+" width:"+this.width+" height:"+this.height;
	}

}
