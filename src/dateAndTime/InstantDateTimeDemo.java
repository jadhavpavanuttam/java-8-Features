package dateAndTime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDateTimeDemo {

    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println("Epoch time is with milliseconds : " + l);
        Instant now = Instant.now();
        System.out.println("Epoch time is with nanoseconds : " + now);
        Instant parse = Instant.parse("2026-08-16T21:42:53.787666220Z");
        if (now.isBefore(parse)) {
            System.out.println("Yes,..... !! Of Course");
        } else {
            System.out.println("Not this one is actually after..!");
        }

        System.out.println("now.getEpochSecond() = " + now.getEpochSecond());
    }
}
