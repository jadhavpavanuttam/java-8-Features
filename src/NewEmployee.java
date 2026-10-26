public class NewEmployee {
    public static void main(String[] args) {
        Employee employee=new Employee() {
            @Override
            public String getName() {
                return "Pavan Jadhav";
            }

            @Override
            public String getSalary() {
                return "10 lpa";
            }
        };
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println("An Parent Class of Employee is : "+employee.getClass().getName());
    }
}
