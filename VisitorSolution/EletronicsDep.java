package projetoPDS.VisitorSolution;

public class EletronicsDep implements Visitable{
	Double salary = 500000.0; //has salary of the Departments and his employees
	Double empSalaries = 1100.0;
	
	public EletronicsDep() {}
	

	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EletronicsDep [salary=" + salary + ", empSalaries=" + empSalaries + "]";
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
