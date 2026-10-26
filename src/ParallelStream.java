import java.util.*;
import java.util.stream.*;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers =
                IntStream.rangeClosed(1, 1_000_000)
                        .boxed()
                        .collect(Collectors.toList());

        long count = numbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println(count);

        //spliterator()
        List<Integer> customerIds =
                Arrays.asList(101, 102, 103, 104);

        Spliterator<Integer> first =
                customerIds.spliterator();

        Spliterator<Integer> second = first.trySplit();

        if (second != null) {
            second.forEachRemaining(
                    id -> System.out.println("Batch A: " + id)
            );
        }

        first.forEachRemaining(
                id -> System.out.println("Batch B: " + id)
        );

        //StringJoiner
        StringJoiner joiner =
                new StringJoiner(", ", "[", "]");

        joiner.add("Amit");
        joiner.add("Priya");
        joiner.add("Rahul");

        System.out.println(joiner);

        //Arrays.parallelSort()
        int[] prices = {900, 200, 700, 100};
        Arrays.parallelSort(prices);

        System.out.println(Arrays.toString(prices));

        //Map enhanceMEnt
        Map<String, Integer> counts = new HashMap<>();

        counts.merge("Laptop", 1, Integer::sum);
        counts.merge("Phone", 1, Integer::sum);
        counts.merge("Laptop", 1, Integer::sum);

        System.out.println(counts);
    }
}