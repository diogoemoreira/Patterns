public class TeamMember extends Decorator{
    //specific position of the employee where he is the team Member
    //every employee can have as many positions as he wishes
    public TeamMember(CompanyInterface emp) {
        super(emp);
    } 
    public void start(){
        emp.start(); System.out.println(emp.getName() +" is a Team Member");
    }
    public void stop(){
        emp.stop(); System.out.println(emp.getName() +" is a Team Member");
    }
}