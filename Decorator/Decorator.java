public abstract class Decorator implements CompanyInterface{
    //decorator has an employee as a variable
    //ALL of decorators methods ARE employees
    //every methods calls the employees method
    CompanyInterface emp;

    public Decorator(CompanyInterface emp){
        this.emp=emp;
    }

    @Override
    public void start() {
        emp.start();
    }
    @Override
    public void stop() {
       emp.stop();
    }
    @Override
    public String getName() {
        return emp.getName();
    }
    
}