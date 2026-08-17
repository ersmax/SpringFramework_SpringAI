package Section2_CoreJava.L065_ProjectEmployeeManagementSystem;

import java.util.Objects;

class Employee {
    private String name;
    private double salary;

    public Employee() {
        name = "No name";
        salary = 0;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double getSalary() {return salary;}

    public void setSalary(double salary) { this.salary = salary;}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 &&
               Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getDetails() {
        return "Name: " + name + ", Salary: " + salary;
    }
}

class Manager extends Employee {

    private String department;

    public Manager() {
        department = "No department";
    }

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {return department;}

    public void setDepartment(String department) { this.department = department;}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(department, manager.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + super.getName() + '\'' +
                ", salary=" + super.getSalary() +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Department: " + department;
    }
}



public class Exercise {

    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 50_000);
        Employee e2 = new Manager("Bob", 80_000, "IT");

        System.out.println(e1.getDetails());
        System.out.println(e2.getDetails());

//        Manager p1 = new Manager("Pippo", 10_000, "ABC");
//        Manager p2 = new Manager("Pippo", 10_000, "ABC");
//        Manager p3 = new Manager();
//        System.out.println(p1);
//        System.out.println(p3);
//
//        Employee e1 = new Employee();
//        Employee e2 = new Manager();
//        System.out.println(e1.equals(e2));
//        System.out.println(e1);
//        System.out.println(e2);
//
//        System.out.println(e1.getDetails());
//        System.out.println(e2.getDetails());
    }

}
