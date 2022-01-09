package homework.day9;
import java.util.*;

public class Seven {
    public static void main(String[] args) {
        ArrayList<Date> list1 = new ArrayList<Date>();
        Date d1 = new Date("d");
        list1.add(d1);
        list1.get(0).showDate();
        Date d2 = new Date("t");
        list1.add(d2);
        list1.get(1).showDate();
        Date d3 = new Date("r");
        list1.add(d3);
        list1.get(2).showDate();
        list1.get(2).showTdiffer();


    }
    
}

class Date {
    Calendar cal = Calendar.getInstance();
    String Date;

    Date(String type) {
        if (type.equals("d")) {
            Date = Integer.toString(cal.get(Calendar.MONTH))+"-"+Integer.toString(cal.get(Calendar.DATE))+"-"+Integer.toString(cal.get(Calendar.YEAR));
        }
        else if (type.equals("t")) {
            cal.add(Calendar.DATE, 1);
            Date = Integer.toString(cal.get(Calendar.MONTH))+"-"+Integer.toString(cal.get(Calendar.DATE))+"-"+Integer.toString(cal.get(Calendar.YEAR));
        }
        else if (type.equals("r")) {
            cal.add(Calendar.DATE, (int)(Math.random()*365 + 1));
            Date = Integer.toString(cal.get(Calendar.MONTH))+"-"+Integer.toString(cal.get(Calendar.DATE))+"-"+Integer.toString(cal.get(Calendar.YEAR));
        }

    }
    
    public void showDate() {
        System.out.println(Date);
    }
    public void showTdiffer() {
        System.out.println(cal.getTimeInMillis());

    }
}


