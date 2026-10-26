package streams;

import java.util.*;
import java.util.stream.*;

class Order {
    private final int id;
    private final double amount;

    Order(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    int getId() {
        return id;
    }

    double getAmount() {
        return amount;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(101, 1200),
                new Order(102, 7500),
                new Order(103, 3000),
                new Order(104, 9500)
        );

        List<Order> highValueOrders = orders.stream()
                .filter(order -> order.getAmount() > 5000)
                .collect(Collectors.toList());

        highValueOrders.forEach(order ->
                System.out.println(order.getId() + " : ₹" + order.getAmount())
        );
        //map()
        List<String> products =
                Arrays.asList("laptop", "phone", "keyboard");

        List<String> names = products.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(names);
        List<Integer> transactions =
                Arrays.asList(500, 15000, 2500, 20000);
// filter()
        List<Integer> largeTransactions = transactions.stream()
                .filter(amount -> amount > 10000)
                .collect(Collectors.toList());

        System.out.println(largeTransactions);
        //flatMap()
        List<List<String>> customerOrders = Arrays.asList(
                Arrays.asList("Laptop", "Mouse"),
                Arrays.asList("Phone", "Charger"),
                Arrays.asList("Keyboard")
        );

        List<String> allProducts = customerOrders.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(allProducts);
//    sorted()
        List<Integer> prices = Arrays.asList(900, 250, 1500, 600);

        List<Integer> sortedPrices = prices.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedPrices);

//distinct()
        List<Integer> ids =
                Arrays.asList(101, 102, 101, 103, 102);

        List<Integer> uniqueIds = ids.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueIds);

        //limit() & skip()
        List<Integer> prices1 =
                Arrays.asList(100, 200, 300, 400, 500);

        List<Integer> topThree = prices1.stream()
                .limit(3)
                .collect(Collectors.toList());

        List<Integer> afterFirstTwo = prices1.stream()
                .skip(2)
                .collect(Collectors.toList());

        //count() , anyMatch() , allMatch()
        List<Integer> amounts =
                Arrays.asList(1000, 2500, 12000, 4000);

        long count = amounts.stream()
                .filter(x -> x > 5000)
                .count();

        boolean hasLargeOrder = amounts.stream()
                .anyMatch(x -> x > 10000);

        boolean allPositive = amounts.stream()
                .allMatch(x -> x > 0);

        boolean noneNegative = amounts.stream()
                .noneMatch(x -> x < 0);

        System.out.println(count);
        System.out.println(hasLargeOrder);
        System.out.println(allPositive);
        System.out.println(noneNegative);
//reduce()

//        stream.reduce(identity, accumulator);
        List<Integer> sales =
                Arrays.asList(1000, 2500, 1500, 3000);

        int total = sales.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Total sales: ₹" + total);

        //sum(),count(),min() & max()

        int total1 = sales.stream()
                .mapToInt(Integer::intValue)
                .sum();

        double average = sales.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        int highest = sales.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

        System.out.println(total);
        System.out.println(average);
        System.out.println(highest);
        //collect() to set or list


        List<String> productList = products.stream()
                .filter(p -> !p.isEmpty())
                .collect(Collectors.toList());

        Set<String> uniqueProducts = products.stream()
                .collect(Collectors.toSet());
    }

}
