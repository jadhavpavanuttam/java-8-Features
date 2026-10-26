package pfcs;

import java.util.Locale;
import java.util.function.Predicate;

public class StringPredict {
    public static void main(String[] args) {


        Predicate<String> strPrd = x -> x.toUpperCase(Locale.ROOT).charAt(0) == 'A' || x.toUpperCase(Locale.ROOT).charAt(0) == 'P';
        Predicate<String> strPrd2 = y -> y.toLowerCase(Locale.ROOT).charAt(y.length() - 1) == 'l';
        Predicate<String> strPrd3 = strPrd.and(strPrd2);
        Predicate<String> strPrd4 = strPrd.or(strPrd2);
//        if (strPrd3.test("amol"))
//            System.out.println("Yes...!!");
        System.out.println(" amol : "+strPrd.negate().test("amol"));  // amol to negate
        System.out.println(" pavan : " + strPrd3.and(strPrd2).test("pavan"));
        System.out.println(" pavan : " + strPrd.or(strPrd2).test("pavan"));

    }
}
