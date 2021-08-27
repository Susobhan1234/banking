import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main (String [] args)
    {
        Calendar rightNow = Calendar.getInstance();
        System.out.println(rightNow.getTime());

        Date currentDate = rightNow.getTime();
        System.out.println(currentDate.getYear() + 1900);
        System.out.println(currentDate.getMonth() + 1);
        System.out.println(currentDate.getDate());
        currentDate.setDate(30);
        System.out.println(currentDate.getDate());
        System.out.println(currentDate.getHours() + ":" + currentDate.getMinutes() + ":" + currentDate.getSeconds());
    }
}
