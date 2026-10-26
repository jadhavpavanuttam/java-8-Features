package pfcs;

import java.sql.ClientInfoStatus;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Ram...".toUpperCase());

        Consumer<List<Integer>> listConsumer = list ->
                System.out.println("MAXIMUM VALUE IS : "+list.stream().max(Integer::compareTo));
        Consumer<List<Integer>> listConsumer1 = list ->
                System.out.println("MINIMUM VALUE IS : "+list.stream().min(Integer::compareTo));


        listConsumer.accept(Arrays.asList(1, 23, 4, 5, 8, 65, 6576));


        listConsumer1.andThen(listConsumer).accept(Arrays.asList(1, 2, 3, 4));  //
    }
}
/**
 * Predicate --> Boolean test(T t)
 * Function --> U apply(T t,U u)
 * Consumer --> void accept(T t)
 * Supplier --> T get()
 */