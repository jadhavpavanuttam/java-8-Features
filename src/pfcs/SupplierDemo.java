package pfcs;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
//        Supplier<Integer> supplier = () -> 12;
//        System.out.println(supplier.get());
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = System.out::println;
        Supplier<Integer> supplier = () -> 992;

        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        } else {
            System.out.println("Error");
        }
    }
}
// supplier --> predicate --> function --> consumer
/**
 * if(predicate.test(supplier.get()))
 * consumer.accept(function.apply(supplier.get()));
 * else
 * s.o.p -->"is not even..."
 */