package pfcs;

import java.util.function.Predicate;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.BiFunction;

;

public class Main {

    public static void main(String[] args) {
//predicate
        Predicate<Double> largeTransaction =
                amount -> amount >= 50000;

        System.out.println(largeTransaction.test(70000.0));
        System.out.println(largeTransaction.test(1000.0));
        //and() ,or(), negate()
        Predicate<Integer> positive = n -> n > 0;
        Predicate<Integer> even = n -> n % 2 == 0;

        Predicate<Integer> positiveEven = positive.and(even);

        System.out.println(positiveEven.test(8));  // true
        System.out.println(positiveEven.test(-8)); // false
        //Function
        Function<Double, Double> applyDiscount =
                price -> price * 0.90;

        System.out.println(applyDiscount.apply(1000.0));
        //Consumer
        Consumer<String> logOrder =
                orderId -> System.out.println("Order processed: " + orderId);

        logOrder.accept("ORD-1001");
        //Supplier

        Supplier<String> generateReference =
                () -> UUID.randomUUID().toString();

        System.out.println(generateReference.get());
//BiFunction
        BiFunction<Double, Integer, Double> totalPrice =
                (price, quantity) -> price * quantity;

        System.out.println(totalPrice.apply(250.0, 4));
    }
}
