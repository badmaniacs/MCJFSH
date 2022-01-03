package homework.day5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time { 
    public static void main(String[] args) {
        Date today = new date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");

        System.out.println(date.format(today) + "" + time.format(today));
    }
}
