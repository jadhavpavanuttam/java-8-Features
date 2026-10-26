package pfcs;

import jdk.dynalink.linker.LinkerServices;

import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
//        Function<String, String> function = x -> x.toUpperCase(Locale.ROOT);
//        System.out.println("UPPERCASE OF GIVEN STRING IS : " + function.apply("pavan"));
//        Function<String, Integer> hashCode = String::hashCode;
//        System.out.println("HASHCODE OF THE GIVEN STRING IS :" + hashCode.apply("pavan").compareTo(hashCode.apply("jagruti")));
//        System.out.println("SUBSTRING OF JAGRUTI IS : " + function.apply("jagruti").substring(0, 3).toUpperCase());
        Function<String, String> function = s -> s.substring(0, 2);

        List<Student> students = List.of(
                new Student("abc", 10),
                new Student("xyz", 15),
                new Student("pqr", 16),
                new Student("lmn", 12),
                new Student("def", 17),
                new Student("nsw", 20),
                new Student("awe", 25),
                new Student("ews", 22)
        );

        Function<List<Student>, List<Student>> stdList = li -> {
            for (Student student : li) {
                if (Boolean.parseBoolean(function.apply(String.valueOf(student.getName().equalsIgnoreCase("pavan")))))
                    students.add(student);
            }
            return li;
        };
//                x.stream()
//                        .filter(y ->
//                                y.getName()
//                                        .subSequence(0, 2)
//                                        .toString()
//                                        .startsWith("p"))
//                        .sorted((a, b) ->
//                                b.getName()
//                                        .length() - a.getName()
//                                        .length())
//                        .toList();
        System.out.println(stdList.apply(students).get(0));
//        stdList
//                .apply(students)
//                .stream()
//                .forEach(System.out::println);
//        System.out.println("CONTAINING NAME LIST IS :" + stdList.getClass().getName());
    }

    private static class Student {
        private String name;

        public String getName() {
            return name;
        }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
//            return "Student{" +
//                    "name='" + name + '\'' +
//                    ", age=" + age +
//                    '}';
            return "name : "
                    + name + " " +
                    ", age : "
                    + age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        private int age;
    }

}
