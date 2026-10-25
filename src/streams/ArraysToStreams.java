package streama;

import java.util.Arrays;
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
        Stream.iterate(0, x -> x + 1).limit(101).forEach(System.out::println);

        System.out.println("Stream.generate(()->Math.random()).limit(100) = " + Stream.generate(() -> Math.random()).limit(100));
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
 */