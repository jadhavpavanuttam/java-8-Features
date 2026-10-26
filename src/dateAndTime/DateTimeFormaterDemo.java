package dateAndTime;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormaterDemo {
    public static void main(String[] args) {
        String date = "15/08/2026";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(parse);

        String dateTimeStr = "2025-04-24 10:30:45+05:30";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssXXX");
        ZonedDateTime parse1 = ZonedDateTime.parse(dateTimeStr, dateTimeFormatter1);
        System.out.println(parse1);

//        LocalDate now = LocalDate.now();
//        LocalDate parse = LocalDate.parse("2026-08-15");
//        dateTimeFormatter.format(parse);

//        if (parse.isBefore(now)) {
//            System.out.println("You are right...!!");
//            return;
//        }
//        System.out.println("You are wrong...!!");
    }
}
