package comparatorEnhancement;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("pavan", "Software Eng", 1231342),
                new Employee("amol", "Designer", 453234),
                new Employee("jagruti", "Tester", 12323452),
                new Employee("swaraj", "Manager", 1231223),
                new Employee("rockey", "Backend Engineer", 8712312),
                new Employee("pavan", "Assistent Manager", 8912312),
                new Employee("dhiraj", "Aassociate Eng", 79612312));


        employees.sort(
                Comparator.comparingInt(Employee::getSalary).reversed()
        );
    }
}
