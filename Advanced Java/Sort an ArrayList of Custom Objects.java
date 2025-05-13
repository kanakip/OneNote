
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Employee {
    String name;
    int age;
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name + " - " + age;
    }
}
public class loop1 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 28));
        employees.add(new Employee("Jane", 25));
        employees.add(new Employee("Doe", 30));
        // Sort by age
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.age, e2.age);
            }
        });
        System.out.println("Sorted Employees by age:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
