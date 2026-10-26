package comparator;

import java.util.*;

public class EmplSort {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(101, "abc", 3143.412),
                new Employee(105, "xyz", 5254.412),
                new Employee(106, "lmn", 6743.412),
                new Employee(104, "pqr", 7843.412),
                new Employee(103, "stu", 9843.412),
                new Employee(107, "def", 3443.412),
                new Employee(102, "wst", 7343.412)
        );
        List<Integer> list2 = List.of(2, 3, 4, 1, 7, 6, 5);

        Map<Integer, Employee> map = new TreeMap<>(Integer::compareTo);  // Comparable--> (x, y) -> x.compareTo(y)

        List<Employee> list1 = list
                .stream()
                .sorted((x, y) -> y.getId() - x.getId()).toList();
        System.out.println("SORTED EMPLOYEES BY ID'S ");
        list1.forEach(x ->
                System.out.println("Id : " + x.getId()
                        + " , " + " Name : " + x.getName()
                        + " , " + " Salery :" + x.getSalary()));
    }
}

class Employee {
    private int id;
    private String name;
    private Double salary;

    public Employee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}