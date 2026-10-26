package iterateHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapIterate {
    public static void main(String[] args) {
        Map<String, Employee> map = new HashMap<>();
        map.put("Software Engineer", new Employee("abc", "xyz", 1));
        map.put("Software Designer", new Employee("lmn", "xyz", 2));
        map.put("Software Tester", new Employee("def", "dhule", 5));
        map.put("AI Engineer", new Employee("klm", "parola", 3));
        map.put("Manager", new Employee("amol", "jalgaon", 6));
        map.put("HR", new Employee("adarsh", "pune", 4));
        int i = 0;
        Map<String, Employee> map1 = new ConcurrentHashMap<>(map);
        Set<Map.Entry<String, Employee>> entries = map1.entrySet();

        for (Map.Entry<String, Employee> entry : entries) {
            if (i == 2) ;
            map1.put("Designer", new Employee("chetan", "mumbai", 7));
            System.out.println(entry.getKey() + "       :       " + entry.getValue());
            i++;
        }
        System.out.println("MODIFIABLE MAP IS  :  " + map1);
    }


    private static class Employee {
        String name;
        String address;
        int id;

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(address, employee.address);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, address, id);
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", id=" + id +
                    '}';
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Employee(String name, String address, int id) {
            this.name = name;
            this.address = address;
            this.id = id;
        }
    }
}
