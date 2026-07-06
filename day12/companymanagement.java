package day12;
import java.util.*;

abstract class Employee{
    protected String name;
    protected int employeeId;
    protected double basicSalary;

    public Employee(String name,int employeeId,double basicSalary){
        this.name =name;
        this.employeeId=employeeId;
        this.basicSalary=basicSalary;
    }
    public abstract double calculateSalary();

    public void displayDetail(){
        System.out.printf("%d %s",employeeId,name);
    }
}
//Manager class
class Manager extends Employee{
    public Manager(String name,int employeeId,double basicSalary){
        super(name,employeeId,basicSalary);
    }
    @Override
    public double calculateSalary(){
        return basicSalary+(0.20*basicSalary);
    }
}
//Developer class
class Developer extends Employee{
    public Developer(String name,int employeeId,double basicSalary){
        super(name,employeeId,basicSalary);
    }
    @Override
    public double calculateSalary(){
        return basicSalary+(0.10*basicSalary);
    }
}
//Intern class
class Intern extends Employee{
    public Intern(String name,int employeeId,double basicSalary){
        super(name,employeeId,basicSalary);
    }
    @Override
    public double calculateSalary(){
        return basicSalary;
    }
}
public class companymanagement {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no.of employee:");
        int n = sc.nextInt();
        List<Employee> employee = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Employee Id:");
            int id=sc.nextInt();
            System.out.println("employee name:");
            String name= sc.next();
            System.out.println("Basic Salary:");
            double basicSalary=sc.nextDouble();
            System.out.println("ROLE:");
            String role=sc.next();
            Employee emp =null;
            switch (role){
                case "Manager":
                    emp = new Manager(name,id,basicSalary);
                    break;
                case "Developer":
                    emp = new Developer(name,id,basicSalary);
                    break;
                case "Intern":
                    emp = new Intern(name,id,basicSalary);
                    break;
                default:
                    System.out.println("Invalid role");
                    continue;
            }
            employee.add(emp);
        }
        for(Employee emp : employee){
            emp.displayDetail();
            String role ="";
            if(emp instanceof Manager){
                role ="Manager";
            }
            else if(emp instanceof Developer){
                role ="Developer";
            } else if (emp instanceof Intern) {
                role ="Intern";
            }
            System.out.printf("%s %1f\n",role,emp.calculateSalary());
        }
        sc.close();
    }
}