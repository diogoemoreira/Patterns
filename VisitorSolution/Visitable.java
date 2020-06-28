package projetoPDS.VisitorSolution;

public interface Visitable {
	//this interface is gonna be implemented by classes that need visitor to implement the changes
	
	public void accept(Visitor visitor);
}
