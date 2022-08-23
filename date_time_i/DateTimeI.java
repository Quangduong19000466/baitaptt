package date_time_i;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

//1	16	26	34	41
public class DateTimeI {

    public static void q1() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, 7);
        calendar.set(Calendar.DATE, 27);

        Date date = calendar.getTime();
        System.out.println("DATE :" + date);
    }

    public static void q16() {
        int twoWeek = 14;
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();

        cal.add(Calendar.DAY_OF_YEAR, twoWeek);
        Date date1 = cal.getTime();
        System.out.println("\nCurrent Date: " + date + "\n");
        System.out.println("Day after two weeks: " + date1 + "\n");
    }

    public static void q34() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        System.out.println("\n" + calendar.getTime() + "\n");

    }

    public static void q41() {
        LocalDate localDate = LocalDate.now();
        String localDateAsString = localDate
                .format(DateTimeFormatter.ofPattern("yyyy-MMM-dd"));
        System.out.println(localDateAsString);

        LocalTime localTime = LocalTime.now();
        String localTimeAsString = localTime
                .format(DateTimeFormatter.ofPattern("hh:mm:ss a"));
        System.out.println(localTimeAsString);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        String localDateTimeAsString = localDateTime
                .format(DateTimeFormatter.ofPattern("yyyy-MMM-dd hh:mm:ss a"));
        System.out.println("\nCombine local Date Time: " + localDateTimeAsString);

    }

    public static void main(String[] args) {
        //q1();
        //q16();
        //q34();
        q41();
    }
}
