package enumDemo;

import java.lang.classfile.attribute.StackMapFrameInfo;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Days[] values = Days.values();
//        System.out.println("VALUES ARE GIVEN  :  "+Arrays.toString(values));
//        System.out.println("Sunday Index Is : "+Days.SUNDAY.ordinal());   ; //return their indexes.
//        Days friday = Days.FRIDAY;
//        Days sunday = Days.valueOf(Days.SUNDAY.toString());
//        System.out.println(sunday);
//        System.out.println(friday.name());
        Days days=Days.valueOf(Days.SUNDAY.name());
        days.displayDays();
    }
}
