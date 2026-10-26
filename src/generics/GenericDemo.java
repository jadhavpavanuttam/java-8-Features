package generics;

import java.util.*;

public class GenericDemo {
    public static void main(String[] args) {
        Demo<Integer, String, Character> obj = new Demo<>(1, "pavan", 'a');
        System.out.println("THE NAME OF CLASS IS : " + obj.getClass().getName());
        System.out.println("Type of T is : " + obj.getT().getClass().getName());
        System.out.println("Type of U is : " + obj.getU().getClass().getName());
        Demo.display('z');
        Demo.display("pavan");
        Demo.display(123.3);
        Demo.display(1.3f);
        Demo.display(234L);
        Demo.display(23123);
//        ArrayList<int[]> ints = new ArrayList<>(Collections.singleton(new int[]{1, 2, 34, 5, 4, 65}));
//        ints.parallelStream().forEach(System.out::println);
//        List<int[]> ints = List.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
//        Set<int[]> list = new HashSet<>(ints);
//        list.forEach(System.out::println);
//    list
//            .stream()
//            .filter(e-> ints.equals(12))
//            .toList()
////            .map(x->x[0]+123)
//            .forEach(System.out::println);
    }
}

class Demo<T, U, Z> {
    T t;
    U u;
    Demo d;

    public Demo(T t, U u, char a) {
        this.t = t;
        this.u = u;
    }

    public T getT() {
        return t;
    }

    public U getU() {
        return u;
    }

    static <Z> void display(Z z) {
        System.out.println("Z CONTAINS CLASS WITH ELEMENT  : " + z.getClass().getName() + " Type");
    }
}