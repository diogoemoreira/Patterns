package projetoPDS.VisitorSolution;

public class MusicDep implements Visitable {
	Double salary = 300000.0; //has salary of the Departments and his employees
	Double empSalaries = 1000.0;
	
	public MusicDep() {}
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "MusicDep [salary=" + salary + ", empSalaries=" + empSalaries + "]";
	}
	
	public Double getEmpSalaries() {
		return empSalaries;
	}
	public void setEmpSalaries(Double empSalaries) {
		this.empSalaries = empSalaries;
	}
	

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
