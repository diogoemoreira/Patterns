public class Main {
    public static void main(String[] args){
        CompanyInterface emp = new Employee("Daniel");
        CompanyInterface leader = new TeamLeader(emp);
        leader.start();
        System.out.println("");
        leader.stop();
        System.out.println("\n");

        CompanyInterface emp2 = new Employee("Fabio");
        CompanyInterface boss = new Boss(emp2);
        boss.start();
        System.out.println("");
        boss.stop();
        System.out.println("\n");
        
        CompanyInterface emp3 = new Employee("Maria");
        CompanyInterface teamLeader = new TeamLeader(new TeamMember(emp3));
        teamLeader.start();
        System.out.println("");
        teamLeader.stop();
        System.out.println("\n");
        
        CompanyInterface emp4 = new Employee("Anthony");
        CompanyInterface teamMember = new TeamMember(new Boss(emp4));
        teamMember.start();
        System.out.println("");
        teamMember.stop();
        System.out.println("\n");
        
        CompanyInterface bossf = new Boss(new TeamLeader(new TeamMember(emp)));
        bossf.start();
        System.out.println("");
        bossf.stop();
    }
}