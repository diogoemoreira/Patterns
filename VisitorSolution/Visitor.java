package projetoPDS.VisitorSolution;

public interface Visitor {
	//Visitor lets us define new operations without changing
	//the classes of the elements on which it operates.
	public void visit(EletronicsDep eletronic);
	public void visit(MusicDep music);
	public void visit(BiologyDep biology);
	public void visit(HealthDep health);
}
