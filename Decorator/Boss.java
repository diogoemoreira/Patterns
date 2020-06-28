public class Boss extends Decorator{
    //specific position of the employee where he is the Boss
    //every employee can have as many positions as he wishes
    public Boss(CompanyInterface emp) {
        super(emp);
    }
    public void start(){
        emp.start(); System.out.println(emp.getName() +" is the Boss");
    }
    public void stop(){
        emp.stop(); System.out.println(emp.getName()+" is the Boss");
    }
    
}