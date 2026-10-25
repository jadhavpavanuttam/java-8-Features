package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        Student1 s1 = new Student1(3, " : A");
        Student1 s2 = new Student1(2, " : B");
        Student1 s3 = new Student1(1, " : C");
        List<Student1> l = new ArrayList<>();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        System.out.println("Before Sorting =" + l);
        Collections.sort(l, (a, b) -> b.id - a.id); //sort in reverse order.
        System.out.println("After Sorting =" + l);
    }
}

class Student1 {
    int id;
    String name;

    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return this.id + "" + this.name;
    }
}