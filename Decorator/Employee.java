public class Employee implements CompanyInterface{
    //Employee is the "main" class
    //an employee has a name and two methods
    //an employee can start working or stop
    String name;

    public Employee(String name){
        this.name=name;
    }

    public void start(){
        System.out.println("Employee "+this.name+" started working!");
    }

    public void stop(){
        System.out.println("Employee "+this.name+" stopped working!");
    }

    public String getName(){
        return this.name;
    }
}