import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<CompanyInterface> company = new ArrayList<CompanyInterface>();
        
        CompanyInterface emp = new Employee("Daniel");
        CompanyInterface leader = new TeamLeader(emp);
        company.add(leader);
        

        CompanyInterface emp2 = new Employee("Fabio");
        CompanyInterface boss = new Boss(emp2);
        company.add(boss);

        CompanyInterface teamLeader = new TeamLeader(new TeamMember(new Employee("Maria")));
        company.add(teamLeader);
        
        CompanyInterface emp4 = new Employee("Anthony");
        CompanyInterface teamMember = new TeamMember(new Boss(emp4));
        company.add(teamMember);
        
        CompanyInterface bossf = new Boss(new TeamLeader(new TeamMember(emp)));
        company.add(bossf);

        for(CompanyInterface worker: company){
            worker.start();
            System.out.println("");
            worker.stop();
            System.out.println("\n");
        }
    }
}