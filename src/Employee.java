public interface Employee {
    String getName();

    String getSalary();
}

class Main {
    public static void main(String[] args) {
        Employee employee = new Employee() {
            @Override
            public String getName() {
                return "PAVAN UTTAM JADHAV";
            }

            @Override
            public String getSalary() {
                return "1000000";
            }
        };
        System.out.println("My Name IS : " + employee.getName());
        System.out.println("My Salery Is : " + employee.getSalary());
    }
}