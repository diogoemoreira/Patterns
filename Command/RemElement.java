import java.util.Collection;

public class RemElement<T> implements CommandInterface {
	private Collection<T> C;
	private T Element;
	private int i;
	public RemElement(Collection<T> C, T Element) {
		//he receives the collection and the element we want to remove from that collection
		this.C = C; this.Element = Element;
		i = 0;
	}
	@Override
	public void execute() {
		//remove an element and increase number of removals we did in the collection
		i++;
		C.remove(Element);
	}

	@Override
	public void undo() {
		//we can add the elements we removed (kinda of a memento for the class)
		if(i>0) {
			C.add(Element);
			i--;
		}
	}

}
