package optional;

import java.util.Locale;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
//        String str = String.valueOf(getName(2));
//        if (str != null)
//        System.out.println(str.toUpperCase(Locale.ROOT));
//        Optional<String> name = getName(2);
//        name.ifPresent(System.out::println);
//        Optional<String> name = getName(2);
//        String s = name.orElse("NA");
//        String s1 = name.orElseGet(() -> "NA");
//        System.out.println(s1);
//        System.out.println(s);
        Optional<String> name = getName(1);
        String s = name.orElseGet(() -> "Ram");
        System.out.println(s);
    }

    private static Optional<String> getName(int id) {
        return Optional.of("Shyam");
    }
}
/**
 * To avoid null pointer Exception we have to used Optional.ofNullable(box);
 * how to create
 * Optional.of()
 * Optional.ofNullable()
 * Optional.empty()
 * <p>
 * check
 * box.isPresent()  -->boolean
 * box.ifPresent()
 * <p>
 * Optional.of(value) -->	Creates an Optional for a non-null value
 * Optional.ofNullable(value)-->	Creates an Optional that may be empty
 * Optional.empty()	--> Represents absence
 * isPresent()	--> Checks whether a value exists
 * ifPresent(action)  -->	Runs an action when a value exists
 * orElse(defaultValue)	--> Returns the value or a default
 * orElseGet(supplier)	--> Computes a fallback only when empty
 * orElseThrow()	--> Throws if empty
 * map()	--> Transforms a present value
 * flatMap()	--> Transforms to another Optional without nesting
 * filter()	--> Keeps the value only if a condition matches
 *
 */