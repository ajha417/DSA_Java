import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime time1 = LocalTime.of(12,35,10,999);
        System.out.println(time1);

//        get all zone id
        /*for (String s: ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }
*/
        LocalTime time2 = LocalTime.now(ZoneId.of("Asia/Calcutta"));
        System.out.println(time2);
    }
}
