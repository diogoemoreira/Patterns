package projetoPDS.VisitorSolution;

public class SpringVisitor implements Visitor{
	
	public SpringVisitor() {}

	@Override
	public void visit(EletronicsDep eletronic) {
		eletronic.setSalary(400000.0);
		eletronic.setEmpSalaries(1000.0);
	}

	@Override
	public void visit(MusicDep music) {
		music.setSalary(350000.0);
		music.setEmpSalaries(1200.0);
	}

	@Override
	public void visit(BiologyDep biology) {
		biology.setSalary(250000.0);
		biology.setEmpSalaries(1100.0);
	}

	@Override
	public void visit(HealthDep health) {
		health.setSalary(1000000.0);
		health.setEmpSalaries(2500.0);
	}



	

}
