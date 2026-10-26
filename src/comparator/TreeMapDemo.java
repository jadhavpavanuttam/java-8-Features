package comparator;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo {
    public static void main(String[] args) {
//        TreeSet<Integer> set = new TreeSet<>();
//        set.add(3);
//        set.add(4);
//        set.add(6);
//        set.add(1);
//        set.add(2);
//        set.add(5);
//        System.out.println(set);  //always returns sorted elements
//        TreeSet<Integer> set1 = new TreeSet<>((a, b) -> b - a);
//        set1.addAll(set);
//        System.out.println(set1);
        TreeMap<Integer, String> map = new TreeMap<>((a, b) -> b - a);
        map.put(1, "one");
        map.put(2, "two");
        map.put(5, "five");
        map.put(3, "three");
        map.put(4, "four");
        System.out.println(map);

        Map<Integer, String> map2 = new TreeMap<>((a, b) -> b - a);
        map2.putAll(map);
        map2.put(6, "six");
        map2.put(9, "nine");
        map2.put(8, "eight");
        map2.put(7, "seven");
        map2
                .entrySet()
                .stream()
                .filter(x -> x.getKey() % 2 == 0)
                .toList()
                .forEach(x ->
                        System.out.println(x.getKey() + " : " + x.getValue()));
    }
}
