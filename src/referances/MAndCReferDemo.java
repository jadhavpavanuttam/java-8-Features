package referances;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MAndCReferDemo {


    public static void main(String[] args) {
//        MAndCReferDemo obj = new MAndCReferDemo();
        List<String> list = Arrays.asList("Alice", "Bob", "Charlie", "Zyanova");
//        list.parallelStream().map(String::toUpperCase).forEach(System.out::println);
//        list.forEach(obj::printEle);  // MAndCReferDemo::printEle --> Method Reference Operator
        List<Student> students = list.stream().map(Student::new).toList(); //--> MAKE NEW STUDENT OBJECTS CORRESPONDING TO THE GIVEN NAMES
        students.stream().forEach(c -> System.out.println(c.getName()));
    }

//    private void printEle(String s) {
//        System.out.println(s.toUpperCase(Locale.ROOT));
//    }

    private static class Student {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
/**
 *
 * Streams is the just like pipeline :
 * Advantages:
 * 1. Readability
 * 2. Flexibility
 * 3. Parallelism --> most large collection is to devide into the small chunks
 * 4. Encapsulation
 */
