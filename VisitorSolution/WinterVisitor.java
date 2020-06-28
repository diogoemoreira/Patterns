package projetoPDS.VisitorSolution;

public class WinterVisitor implements Visitor{
	
	public WinterVisitor() {}

	@Override
	public void visit(EletronicsDep eletronic) {
		eletronic.setSalary(367000.0);
		eletronic.setEmpSalaries(967.53);
	}

	@Override
	public void visit(MusicDep music) {
		music.setSalary(380000.0);
		music.setEmpSalaries(1230.7);
	}

	@Override
	public void visit(BiologyDep biology) {
		biology.setSalary(100000.0);
		biology.setEmpSalaries(750.3);
	}

	@Override
	public void visit(HealthDep health) {
		health.setSalary(1200000.0);
		health.setEmpSalaries(2550.9);
	}

}
