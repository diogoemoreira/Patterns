package projetoPDS.VisitorSolution;

public class HealthDep implements Visitable {
	Double salary = 800000.0; //has salary of the Departments and his employees
	Double empSalaries = 2000.0;
	
	public HealthDep() {}
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "HealthDep [salary=" + salary + ", empSalaries=" + empSalaries + "]";
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
