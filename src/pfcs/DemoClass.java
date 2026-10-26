package pfcs;

import java.util.Arrays;
import java.util.List;

public class DemoClass {
    public static void main(String[] args) {
        List<Student1> list = Arrays.asList(
                new Student1("abc", 1),
                new Student1("pqr", 4),
                new Student1("xyz", 2),
                new Student1("lmn", 3),
                new Student1("opq", 5),
                new Student1("stu", 6));
        list
                .stream()
                .sorted((x, y) ->
                        y.getAge() - x.getAge())
                .toList()
                .stream()
                .forEach(x ->
                        System.out.println(x.getName()
                                + " : " + x.getAge()));

    }
}

class Student1 {
    private String name;

    public String getName() {
        return name;
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
}