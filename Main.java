import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat form = new SimpleDateFormat("yyyy:MM:dd hh:mm:ss: S a");
        Date date = new Date();
        System.out.println(form.format(date));
    }

}
