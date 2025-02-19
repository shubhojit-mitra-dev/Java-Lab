public class Question5 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Khushi", 101, 50000);

        System.out.println("Employee 1: " + emp1.getName() + ", ID: " + emp1.getEmpid() + ", Salary: " + emp1.getSalary());
        System.out.println("Employee 2: " + emp2.getName() + ", ID: " + emp2.getEmpid() + ", Salary: " + emp2.getSalary());

        emp2.increaseSalary(10);
        System.out.println("Employee 2 after salary increase: " + emp2.getName() + ", Salary: " + emp2.getSalary());

        Manager mgr = new Manager("Shubhojit", 102, 70000, "IT");
        System.out.println("Manager: " + mgr.getName() + ", Salary: " + mgr.getSalary() + ", Department: " + mgr.getDepartment());

        mgr.increaseSalary(15);
        System.out.println("Manager after salary increase: " + mgr.getName() + ", Salary: " + mgr.getSalary() + ", Department: " + mgr.getDepartment());
    }
}

class Employee {
    private String name;
    private int empid;
    private double salary;

    public Employee() {
        this.name = "Unknown";
        this.empid = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public int getEmpid() {
        return empid;
    }
    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        }
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}