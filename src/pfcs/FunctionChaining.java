package pfcs;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
//        Function<String, String> function = String::toUpperCase;
//        Function<String, String> function1 = x -> x.substring(1, 4);
        Function<String, String> identityFun = Function.identity();
////        Function<String, String> function2 = function.andThen(function1);
////        System.out.println("FUNCTION CHAINING APPLYING ON JAGRUTI : "+function2.apply("jagruti"));
//        System.out.println(function.andThen(function1).apply("amol"));
//        System.out.println(function1.compose(function).apply("amol"));
//        System.out.println(function1.andThen(function).apply("amol"));
        System.out.println("IDENTITY IS : " + identityFun.apply("function.apply(hello)"));
    }
}
/**
 * we have to used compose() method to reverse this one :
 * 1 : function.andThen(function1).apply(arg);
 * 2 : function1.andThen(function).apply(arg);
 * 3 : function.compose(function1).apply(arg);  // to reverse the function calling
 * andThen()
 * compose()
 * identity() --> same input same output no changes
 * this is the static method of Function Interface --> Function.identity();
 * we have to got same output for the 2 & 3
 */