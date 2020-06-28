public class TeamLeader extends Decorator{
    //specific position of the employee where he is the team Leader
    //every employee can have as many positions as he wishes
    public TeamLeader(CompanyInterface emp) {
        super(emp);
    }
    public void start(){
        emp.start(); System.out.println(emp.getName() +" is a Team Leader");
    }
    public void stop(){
        emp.stop(); System.out.println(emp.getName() +" is a Team Leader");
    }
}