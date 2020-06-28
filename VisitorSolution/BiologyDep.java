package projetoPDS.VisitorSolution;

public class BiologyDep implements Visitable {
	protected Double salary = 200000.0; //has salary of the Departments and his employees
	protected Double empSalaries = 1000.0;
	
	public BiologyDep(){}
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "BiologyDep [salary=" + salary + ", empSalaries=" + empSalaries + "]";
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
