
package Java12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**Collector Teeing Java 12 Example
 * @author asharda
 *
 */
class Employee
{
    private long id;
    private String name;
    private double salary;

    public Employee(long id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }
    //Getters and setters

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}
public class CollectorTeeing {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "A", 100),
                new Employee(2, "B", 200),
                new Employee(3, "C", 300),
                new Employee(4, "D", 400));

        HashMap<String, Employee> result = employeeList.stream().collect(
                Collectors.teeing(
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                        Collectors.minBy(Comparator.comparing(Employee::getSalary)),
                        (e1, e2) -> {
                            HashMap<String, Employee> map = new HashMap();
                            map.put("MAX", e1.get());
                            map.put("MIN", e2.get());
                            return map;
                        }
                ));

        System.out.println(result);
    }

}
