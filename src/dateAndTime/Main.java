package dateAndTime;

import java.time.*;
import java.util.Base64;
import java.nio.charset.StandardCharsets;

import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate orderDate = LocalDate.of(2026, 10, 25);

        LocalDate deliveryDate = orderDate.plusDays(7);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println(orderDate.format(formatter));
        System.out.println(deliveryDate.format(formatter));
//LocalDate
        LocalDate joiningDate = LocalDate.of(2022, 6, 15);
        LocalDate today = LocalDate.of(2026, 10, 25);

        Period service = Period.between(joiningDate, today);

        System.out.println(service.getYears() + " years");
        System.out.println(service.getMonths() + " months");
        System.out.println(service.getDays() + " days");

        //Instant
        Instant start = Instant.parse("2026-10-25T10:00:00Z");
        Instant end = Instant.parse("2026-10-25T10:00:05Z");

        Duration duration = Duration.between(start, end);

        System.out.println(duration.toMillis());
        //Zoned
        ZonedDateTime indiaTime =
                ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        ZonedDateTime londonTime =
                indiaTime.withZoneSameInstant(ZoneId.of("Europe/London"));

        System.out.println(indiaTime);
        System.out.println(londonTime);

        //Based64
        String original = "Order-101";

        String encoded = Base64.getEncoder()
                .encodeToString(original.getBytes(StandardCharsets.UTF_8));

        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decoded = new String(decodedBytes, StandardCharsets.UTF_8);

        System.out.println(encoded);
        System.out.println(decoded);
    }
}
