public class Main {
	public static void main(String[] args) {
		//Prototype Pattern ({Shape}-abstract class; {Rectangle,Circle}- Classes that Extend to Shape) -> this pattern implements clone
		//for the sake of testing the color of cloned objects is changed to black
		Shape[] array = new Shape[5];
		
		Shape circle = new Circle();
		array[0] = circle;
		Shape circle2 = circle.clone();
		array[1]=circle2;
		Shape circle3 = circle.clone();
		array[2]=circle3;
		
		Shape rectangle = new Rectangle();
		array[3]=rectangle;
		Shape rectangle2 = rectangle.clone();
		array[4]=rectangle2;
		
		for(Shape s: array) {
			System.out.println(s);
		}
	}
}
