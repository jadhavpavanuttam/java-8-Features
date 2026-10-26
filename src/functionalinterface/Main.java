package functionalinterface;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<String> customers =
//                Arrays.asList("Amit", "Priya", "Rahul");
//
//        customers.forEach(name -> System.out.println(name));

        // Equivalent method-reference form
//        customers.forEach(System.out::println);
        List<String> ids = Arrays.asList("101", "102", "103");

        List<Integer> numericIds = ids.stream()
                .map(Integer::parseInt)
                .collect(java.util.stream.Collectors.toList());

        System.out.println(numericIds);

        DiscountPolicy festivalDiscount = amount -> amount * 0.20;

        DiscountPolicy memberDiscount = amount -> amount * 0.10;

        double bill = 5000;

        System.out.println("Festival discount: " + festivalDiscount.calculateDiscount(bill));

        System.out.println("Member discount: " + memberDiscount.calculateDiscount(bill));
    }
}

@FunctionalInterface
interface DiscountPolicy {
    double calculateDiscount(double amount);
}
