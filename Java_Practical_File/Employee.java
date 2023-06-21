import java.util.Scanner;
class Employee {
    String name;
    int age;
    String department;
    double salary;

    
    Employee() {
        name = "";
        age = 0;
        department = "";
        salary = 0.0;
    }

    
    Employee(String x, int y, String z, double q) {
        name = x;
        age = y;
        department = z;
        salary = q;
    }
    Employee(Employee r) {
        name =r.name ;
        age = r.age;
        department = r.department;
        salary = r.salary;
    }




    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }

    void readinfo(){
        System.out.println("enter Name:");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.println("enter age:");
        Scanner ac=new Scanner(System.in);
        age=ac.nextInt();
        System.out.println("enter department:");
        Scanner dc=new Scanner(System.in);
        department=dc.nextLine();
        System.out.println("enter salary:");
        Scanner cc=new Scanner(System.in);
        salary=cc.nextInt();
    }
}
class Emp{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.displayInfo();
        System.out.println("_______________________");
        emp2.readinfo();
        emp2.displayInfo();
        System.out.println("_______________________");
        
        System.out.println("Sahib Preet Singh 00713211621");
    }
}
