package dateAndTime;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class DurationDemo {
    public static void main(String[] args) throws InterruptedException {
        Instant start = Instant.now();
        Instant end = null;
        for (int i = 0; i < 101; i++) {
            Thread.sleep(30);
            if (i == 100) {
                end = Instant.now();
            }
        }
        Duration duration = Duration.of(10000L, TimeUnit.SECONDS.toChronoUnit());
        System.out.println("Duration is : " + duration);
        System.out.println("Duration between start and end is: " + Duration.between(start, end));

        System.out.println("Comparison is: " + end.compareTo(start));  // 1,-1,0
    }
}
/**
 * PT --> Period Of Time
 * to determine the durations between time or seconds so we have to used duration
 *
 */