package Home.sorting;

import java.util.*;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR", 50000.0));
        employees.add(new Employee("Bob", "Engineering", 60000.0));
        employees.add(new Employee("Charlie", "HR", 55000.0));
        employees.add(new Employee("David", "Engineering", 60000.0));

        // Write code here to sort the 'employees' list based on their salaries in descending order.
        // If salaries are the same, sort alphabetically by names in ascending order.
        Collections.sort(employees, (x, y) -> {
            int salaryComparison = Double.compare(y.getSalary(), x.getSalary());
            if (salaryComparison != 0) {
                return salaryComparison;
            }

            // If salaries are equal, compare names
            return x.getName().compareTo(y.getName());
        });

        // Print the sorted list of employees.
        System.out.println(employees);
    }
}
