import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Data {
    public static void main(String[] args) {
        SimpleDateFormat hora= new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
        Date d=Date.from(Instant.parse("2022-04-30T08:00:50Z"));
        System.out.println(hora.format(d));
        Calendar cal =Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY,3);
        d=cal.getTime();
        System.out.println(hora.format(d));
    }


}
