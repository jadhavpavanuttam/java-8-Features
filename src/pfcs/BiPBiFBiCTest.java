package pfcs;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPBiFBiCTest {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (x, y) ->
                y == x.length();
        System.out.println(biPredicate.test("amol", 4));

        BiFunction<String, String, String> biFunction = (x, y) -> x.concat(y).equalsIgnoreCase(x) ? "yes" : "No";
        System.out.println(biFunction.apply("pavan", ""));

        BiConsumer<Integer, Boolean> biConsumer = (x, y) -> {
            System.out.println("x : " + x + " , " + " y : " + y);
        };
        biConsumer.accept(1 * 2, 'a' < 'b');

    }
}
/**
 * Note : By Supplier is not have
 * Because of any method in the world
 * will returns only one value for the output
 * so this is cannot be often requirements
 * Supplier<T> --> T get()
 */