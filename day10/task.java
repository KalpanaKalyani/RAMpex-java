package day10;
import java.util.Scanner;
class Student {
    private String name;
    private int id;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void display() {
        System.out.println("Student Name : " + getName());
        System.out.println("Student ID   : " + getId());
    }
}
class Mentor {
    private String name;
    private int exp;
    public Mentor(String name, int exp) {
        this.name = name;
        this.exp = exp;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }
    public String getName() {
        return name;
    }
    public int getExp() {
        return exp;
    }
    public void display() {
        System.out.println("Mentor Name  : " + getName());
        System.out.println("Experience   : " + getExp() + " years");
    }
}
class Hod {
    private String name;
    private String department;
    public Hod(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public void display() {
        System.out.println("HOD Name     : " + getName());
        System.out.println("Department   : " + getDepartment());
    }
}
public class task {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String sname = sc.nextLine();

        System.out.print("Enter Student ID: ");
        int sid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Mentor Name: ");
        String mname = sc.nextLine();

        System.out.print("Enter Mentor Experience: ");
        int exp = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter HOD Name: ");
        String hname = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        Student s1 = new Student(sname, sid);
        Mentor m1 = new Mentor(mname, exp);
        Hod h1 = new Hod(hname, dept);

        System.out.println("\n----- Details -----");
        s1.display();
        m1.display();
        h1.display();

        sc.close();
    }
}