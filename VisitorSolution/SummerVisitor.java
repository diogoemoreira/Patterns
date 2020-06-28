package projetoPDS.VisitorSolution;

public class SummerVisitor implements Visitor {
	
	public SummerVisitor() {}

	@Override
	public void visit(EletronicsDep eletronic) {
		eletronic.setSalary(550000.0);
		eletronic.setEmpSalaries(1300.0);
	}

	@Override
	public void visit(MusicDep music) {
		music.setSalary(500000.0);
		music.setEmpSalaries(1400.0);
	}

	@Override
	public void visit(BiologyDep biology) {
		biology.setSalary(190000.0);
		biology.setEmpSalaries(900.0);
	}

	@Override
	public void visit(HealthDep health) {
		health.setSalary(700000.0);
		health.setEmpSalaries(1900.0);
	}



}
