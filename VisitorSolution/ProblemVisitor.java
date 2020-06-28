package projetoPDS.VisitorSolution;

public class ProblemVisitor implements Visitor{

	@Override
	public void visit(EletronicsDep eletronic) {
		System.out.println("\nThe Eletronics Department has a problem with the computers and needs help!");
		eletronic.setSalary(eletronic.getSalary()-50);	
	}

	@Override
	public void visit(MusicDep music) {
		System.out.println("\nThe Music Department has a problem with the mixers!");
		music.setSalary(music.getSalary()-80);			
	}

	@Override
	public void visit(BiologyDep biology) {
		System.out.println("\nThe Biology Department needs some more materials to work!");
		biology.setSalary(biology.getSalary()-30);	
	}

	@Override
	public void visit(HealthDep health) {
		System.out.println("\nThe Health Deparment has an emergency and needs an ambulance!");
		health.setSalary(health.getSalary()-100);	
	}

}
