package comparatorEnhancement;

import java.util.*;

class Employee {
    private final String name;
    private final String department;
    private final int salary;

    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    String getDepartment() {
        return department;
    }

    int getSalary() {
        return salary;
    }
}
