import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 1, 2);

        LocalTime time = LocalTime.of(13, 20);

        LocalDateTime dateTime = date.atTime(time);

        ZoneId zone = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = dateTime.atZone(zone);

        ZonedDateTime newDateTime = zonedDateTime.plusMinutes(1)
                .plusHours(1)
                .plusDays(1)
                .plusYears(1);

        System.out.println("Original date and time: " + zonedDateTime);
        System.out.println("New date and time: " + newDateTime);
    }
}
