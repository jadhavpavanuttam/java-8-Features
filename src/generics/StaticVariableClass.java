package generics;

public class StaticVariableClass {
    public static void main(String[] args) {
        Test<Integer> t = new Test<>(123);
        System.out.println(t.getT(123));
        Test<Character> t1 = new Test<>('d');
        System.out.println(t1.getT('a'));
        Test<Long> t2 = new Test<>(123L);
        System.out.println(t2.getT(323L));
        Test<Float> t5 = new Test<>(123.3f);
        System.out.println(t5.getT(23.3f));
        Test<Double> t6 = new Test<>(123.32);
        System.out.println(t6.getT(232.32));
        Test<Boolean> t3 = new Test<>(false);
        System.out.println(t3.getT(true));

        System.out.println("COUNTING IS :" + Test.count);
    }
}

class Test<T> {
    static int count = 0;

    Test(T c) {
        count++;
    }

    T getT(T c) {
        return c;
    }
}