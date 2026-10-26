package collectionsframeworks;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListDemo {
    public static void main(String[] args) {
        

//        Predicate<Integer> ints = x -> x % 2 == 0;
//        if (!ints.test(123))
//            System.out.println("Ho bhau...");
//        List<Integer> list = new CopyOnWriteArrayList<>();
//        Vector<Integer> list = new Vector<>();
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(1);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(6);
//        list.add(8);
//        Enumeration<Integer> elements = list.elements();
//        while (elements.hasMoreElements())
//            System.out.println(elements.nextElement());

//        ListIterator<Integer> li = list.listIterator();
//        while (li.hasNext())
//            System.out.println(li.next());
//        System.out.println("-----------------------------------------");
//        while (li.hasPrevious())
//            System.out.println(li.previous());


//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            if (next == 5)
//                list.remove(next);
//            System.out.println(next);
//        }

//        for (int i : list) {
//            if (list.contains())
//            System.out.println(i);
//        }

//        if (list.contains(8))
//            System.out.println("as case");
//        list.remove(2);

//        Integer sum = list
//                .stream()
//                .reduce(0, (x, y) ->
//                        x + y);


//        System.out.println("SUM OF ALL THE NUMBER IS : " + sum);

//        Set<Integer> collect = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toSet());
//        collect.forEach(x -> System.out.println(x));

        Emp emp = () -> "Software Engineer..";
        System.out.println(emp.getInfo()+" : "+emp.getClass().getName().toString());
    }

}

@FunctionalInterface
interface Emp {
    String getInfo();

    static Integer getId() {
        return 123;
    }
}