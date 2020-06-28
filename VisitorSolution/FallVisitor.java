package projetoPDS.VisitorSolution;

public class FallVisitor implements Visitor{
	
	public FallVisitor() {}

	@Override
	public void visit(EletronicsDep eletronic) {
		eletronic.setSalary(460000.0);
		eletronic.setEmpSalaries(1050.5);
	}

	@Override
	public void visit(MusicDep music) {
		music.setSalary(200000.0);
		music.setEmpSalaries(900.0);
	}

	@Override
	public void visit(BiologyDep biology) {
		biology.setSalary(300000.0);
		biology.setEmpSalaries(1260.8);
	}

	@Override
	public void visit(HealthDep health) {
		health.setSalary(6000000.0);
		health.setEmpSalaries(2070.1);
	}

	

}
