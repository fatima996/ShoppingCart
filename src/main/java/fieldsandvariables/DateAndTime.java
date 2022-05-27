package fieldsandvariables;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Fatima Trtak
 */
public class DateAndTime {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2022, 10, 31, 9, 45);
        var pattern = DateTimeFormatter.ofPattern("EEEE, LLLL dd, yyyy 'at' hh:mm");

        String dateTimeString = localDateTime.format(pattern);
        System.out.println(dateTimeString);
    }

}
