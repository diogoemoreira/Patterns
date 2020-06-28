import java.util.Collection;
public class AddElement<T> implements CommandInterface {
	private Collection<T> C;
	private T Element;
	private int i;
	public AddElement(Collection<T> C, T Element) {
		//he receives the collection and the element we want to add to that collection
		this.C = C; this.Element = Element;
		i = 0;
	}
	@Override
	public void execute() {
		//add an element and increase number of adds we did in the collection
		i++;
		C.add(Element);
	}
	@Override
	public void undo() {
		//we can remove the elements we added (kinda of a memento for the class)
		if(i > 0){
			C.remove(Element);
			i--;
		}
	}

}
