package InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Sort employees based on their salary in descending order using Java Streams.
public class SortEmployeesOnSalaryInDescOrder {

    class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', salary=" + salary + "}";
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {
        SortEmployeesOnSalaryInDescOrder sorter = new SortEmployeesOnSalaryInDescOrder();
        Employee[] employees = {
                sorter.new Employee("Alice", 50000),
                sorter.new Employee("Bob", 60000),
                sorter.new Employee("Charlie", 55000)
        };

        List<Employee> emps = Arrays.stream(employees)
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .toList();

        for (Employee employee : emps) {
            System.out.println(employee);
        }
    }
}
