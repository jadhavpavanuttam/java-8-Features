package dateAndTime;

import java.time.*;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
//        LocalDate today = LocalDate.now();
//
//        LocalDate localDate = LocalDate.of(1990, 2, 7);
//        System.out.println(today.getYear() + " " + today.getMonth() + " " + today.getDayOfMonth());
//        System.out.println("Epoch Day : "+today.toEpochDay());
//        LocalDate yesterday = today.minusDays(1);
//     if (today.isAfter(yesterday))
//        System.out.println("Yes sir..!!" +
//                " Of Course...");
//        LocalTime now = LocalTime.now();
//        LocalTime localTime = LocalTime.of(1, 23, 34, 600122800);
//        if (now.isAfter(localTime)) {
//            System.out.println(localTime+" is comes before " + now);
//    }
//      String str="13:23:45";
//        LocalTime parse = LocalTime.parse(str);
//        System.out.println("PARSED TIME IS :"+parse.isBefore(now));
//        LocalTime localTime = parse.minusHours(1);
//    if (now.isAfter(localTime))
//    {
//        System.out.println("Easily...!!");
//    }
//        Temporal temporal = LocalDateTime.MAX.adjustInto(LocalDateTime.now());
//        System.out.println(temporal.toString());
//        LocalDateTime now = LocalDateTime.now();
//        LocalDateTime parse = LocalDateTime.parse("2026-08-15T17:01:03.545888300");
//        if (now.isAfter(parse)) {
//            System.out.println("YES OKEY, BRO...!!");
//        }

        ZonedDateTime india = ZonedDateTime.now();  //U.T.C.
        ZonedDateTime urop = ZonedDateTime.now(ZoneId.of("Europe/Athens"));  //U.T.C.
        System.out.println("India : "+india);
        System.out.println("Urop : "+urop);
        ZonedDateTime parse = ZonedDateTime.parse("2026-08-17T00:28:59.912407200+03:00[Europe/Athens]");
        System.out.println("PARSE DATE TIME IS : "+parse);

//        ZoneId
//                .getAvailableZoneIds()
//                .stream()
//                .distinct()
//                .forEach(System.out::println);

//        Custom date time creation
//        ZonedDateTime europ = ZonedDateTime.of(2026, 8, 26, 5, 22, 30, 54, ZoneId.of("Europe/Athens"));
//        ZonedDateTime india = ZonedDateTime.of(2002, 6, 5, 5, 45, 55, 54, ZoneId.of("Asia/Calcutta"));
//        System.out.println("Urop : " + europ);
//        System.out.println("India : " + india);
    }
}
/**
 * Issues with legacy DATE AND CALENDAR classes
 * mutable
 * confusing
 * limited functionality (Zoned , diff)
 * <p>
 * New Date and Time classes
 * <p>
 * LocalDate --> represent a date without time Zone
 * LocalTime --> represent a date without date or Time Zone
 * LocalDateTime -->  represent a date and time zoned
 * ZonedDateTime --> date and time with zoned U.T.C time is constant at everywhere.
 * Instance --> Represents an instantaneous point on the timeline
 * Period --> Represents a period of time between two dates
 * DateTimeFormatter --> Formats and parse dates and times.
 */