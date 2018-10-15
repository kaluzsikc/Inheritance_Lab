package Employee;

public class Employee {
    private String name;
    private int NINumber;
    private double salary;

    public Employee(String name, int NINumber, double salary){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        if (name != null){
        this.name = name;
        }
    }

    public int getNINumber(){
        return this.NINumber;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double salaryRaise){
        if (salaryRaise > 0){this.salary += salaryRaise;}
    }

    public double payBonus(){
       return this.salary/100;
    }
}
