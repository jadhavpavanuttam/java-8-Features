package functionalinterface;

public class LambdaDemo {
    public static void main(String[] args) {
        Employee se = () -> "Software Engineer";
        Employee ed = () -> "Editor";
        System.out.println("ROLE OF EMPLOYEE IS : " + se.getInfo());
        System.out.println("ROLE OF EMPLOYEE IS : " + ed.getInfo());
    }
}
@FunctionalInterface
interface Employee {
    public String getInfo();
}