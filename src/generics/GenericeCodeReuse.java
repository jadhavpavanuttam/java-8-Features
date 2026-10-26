package generics;

import static java.util.Collections.swap;

public class GenericeCodeReuse {
    public static void main(String[] args) {
        Integer[] a = {6, 7, 5, 3, 23, 2, 5, 456};
        sort(a);
        String[] strings = {"pqr", "abc", "lmn", "xyz"};
        sort(strings);
        Float[] f = {5.4f, 5.4f, 6.5f, 43.2f};
        sort(f);
    }

    private static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if (arr[j].compareTo(arr[i]) == 0)
                    swap(i, j, arr);
            }

        }
        for (T i : arr)
            System.out.println(i + " , ");
        System.out.println();
    }

    private static <T> void swap(int i, int j, T[] arr) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
