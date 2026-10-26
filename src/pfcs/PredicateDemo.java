package pfcs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 1000;
        System.out.println("Predicate : " + predicate.test(10000));
        if (predicate.test(120))
            System.out.println("Yeah.....!!");

        List<Integer> list = Arrays.asList(6, 5, 5, 6, 4, 5, 6, 7, 8, 89, 89);
//        list
//                .stream()
//                .filter(x->x%2==0)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);
        list
                .stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(x -> x)
                .average()
                .ifPresent(x -> System.out.println("Average Is : " + x));
        Predicate<Integer> isEven = x -> x % 2 == 0;
        for (Integer i : list)
            if (isEven.test(i))
                System.out.println(" " + i);
        System.out.println();
    }
}

/**
 * Predicate  --> test()
 * Function  --> apply()
 */