package comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6, 5, 99, 9, 65, 8, 78, 0, 9);
//        Collections.sort(list, new Comp());
        Collections.sort(list, (a, b) -> b - a);
        System.out.println(list);
    }
}

class Comp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
