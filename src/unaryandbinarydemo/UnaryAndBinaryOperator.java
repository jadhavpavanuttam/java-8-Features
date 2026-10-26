package unaryandbinarydemo;

import java.util.Locale;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryOperator {
    public static void main(String[] args) {
//        Function<Integer, Integer> function = x -> x * x;
//        Function<String, String> function1 = x -> x + x;
//        Function<String, Integer> function1 = x -> x + x;  // cannot be suppoerted. as UnaryOperator.

        UnaryOperator<Integer> operator = x -> x * x;
        UnaryOperator<String> operator1 = x -> x + x;
        System.out.println(operator.apply(2));
        System.out.println(operator1.apply("hello "));

//        BinaryOperator<>
        BinaryOperator<Integer> binaryOperator1 = (x, y) -> x * y;
        BinaryOperator<String> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator1.apply(3, 5));
        System.out.println(binaryOperator.apply("pavan", " jadhav"));
    }
}
/**
 * Note : UnaryOperator<T> such that Function<T,T> or UnaryOperator<T> extends Function<T,T>
 * is it mean we want Function<T,T> both parameter of the same type
 * when same type of input argument is
 * equal to the same arguments of output
 * that time we have to used unary operator.
 * <p>
 * Note : {@link BinaryOperator} -->is the implementation of BiFunction for the same types of an arguments.
 * Represents an operation upon two
 * operands of the same type, producing
 * a result of the same type as the operands.
 * This is a specialization of BiFunction
 * for the case where the operands and
 * the result are all the same type.
 */
