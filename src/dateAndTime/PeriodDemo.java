package dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate then = LocalDate.of(2010, 3, 11);
        LocalDate then1 = LocalDate.of(2002, 6, 5);
        Period between = Period.between(now, then);
        Period between1 = Period.between(now, then1);
        System.out.println("I am  " + between1 + "   Year Old...");
        System.out.println("My Rock Is : " + between + " Year Old..");

    }
}
/**
 * In case of period we have to used
 * Period --> to compare between years , months and so on...
 */