package referances;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Product {
    private final String name;

    Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Laptop", "Phone", "Tablet");

        List<Product> products = names.stream()
                .map(Product::new)
                .collect(Collectors.toList());

        System.out.println(products);
    }
}