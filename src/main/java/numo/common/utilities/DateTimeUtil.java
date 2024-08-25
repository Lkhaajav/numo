package numo.common.utilities;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

public class DateTimeUtil {

    /**
     * 현재시각을 포매팅하여 반환
     *
     * @param format 포맷문자열
     * @return String
     */
    public static String getCurrentDateTime(String format) {
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Seoul");
        Calendar calendar = Calendar.getInstance(timeZone);
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(calendar.getTime());
    }

    public static String format(Timestamp timestamp, String format) {
        LocalDateTime localDateTime = timestamp.toLocalDateTime();
        return localDateTime.format(DateTimeFormatter.ofPattern(format));
    }

    public static Timestamp parse(String dateTime, String format) {
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern(format));
        return Timestamp.valueOf(localDateTime);
    }

    public static LocalDateTime getMinimumLocalDateTime() {
        LocalDateTime minDateTime = LocalDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.of(0, 0, 1, 0));
        return minDateTime;
    }
}
