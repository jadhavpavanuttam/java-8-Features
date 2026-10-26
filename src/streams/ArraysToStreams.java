package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysToStreams {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "anjeer", "mango", "ananas"};
        Arrays
                .stream(arr)
                .filter(x ->
                        x.startsWith("a"))
                .collect(Collectors.toSet())
                .forEach(System.out::println);

//        Stream.of(1,2,34,3,5).map(x->x+=23).forEach(System.out::println);
        Optional<Integer> max = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .distinct()
                .max((x, y) -> x - y).get().describeConstable();
        System.out.println(max.orElse(0));
//        Stream
//                .generate(() -> Math.random() * 100)
//                .limit(100)
////                .map(x->(int)Math.ceil(x))
//                .map(x->(int)Math.floor(x))
////                .count();
//                .forEach(System.out::println);
    }
}
/**
 * the way to implement stream
 * 1.list.stream();
 * 2.Arrays.stream(arr);
 * 3.Stream.of(values....);
 * 4.Stream.iterate(start,n->(logic)).limit(x);  // if not have limit that time it has goes on infinite loop
 * 5.Stream.generate(()->"hello").limit()
 *
 * useful methods
 * --------------------
 * distinct()
 * filter()
 * limit()
 * map()
 * collect( Collectors.toList())
 * peek()
 * skip()
 * sorted((x,y)->y-x)
 *----------------------------------
 *Terminal Operations :
 * min()
 * max()
 * count()
 * collect()
 *
 */