package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
public class Demo1 {
    public static void main(String[] args) {
        List<Employee> emplist = Arrays.asList(
           new Employee(1,"Alex",35000),
           new Employee(2,"Allen",65000),
           new Employee(1,"Sly",25000),
           new Employee(1,"Mike",27000)
        );

        List<Integer> adjusted = emplist.stream()
                .filter(e -> e.salary > 30000)
                .map(e -> e.salary)
                .collect(Collectors.toList());

        System.out.println(adjusted);
    }

}
