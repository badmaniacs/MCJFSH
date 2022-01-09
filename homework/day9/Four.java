package homework.day9;

import java.util.Calendar;

public class Four {
    public static void main(String[] args) { 
        realAirplane a1 = new realAirplane();
        a1.setDeparture(2022, 2, 1);
        a1.setArrival(2022, 2, 2);
    }    
}

class realAirplane extends Airplane {
    String arr1[] = new String[] {"김포","인천","김해","제주","울산"};
    String arr2[] = new String[] {"도쿄","상하이","홍콩","싱가폴","쿠알라룸푸르"};
    String start = "인천";
    String destination = "도쿄";
    public void isDomestic() {
        for (int i = 0; i<arr1.length;i++) {
            if (start.equals(arr1[i])) {
                for (int j=0; j<arr2.length;j++){
                    if (destination.equals(arr2[j])) {
                        this.isDomestic = false;
                    }
                    else {
                        this.isDomestic = true;
                    }                   
                }                    
            }                             
        }
    }
}


abstract class Airplane {
    String departure;
    String arrival;
    boolean isDomestic = false;
    String flightType;

    Calendar cal = Calendar.getInstance();
    
    public String getDeparture() {
        return departure;
    }
    public void setDeparture(int YEAR, int MONTH, int DATE) {
        cal.set(YEAR, MONTH, DATE);
        departure = Integer.toString(cal.get(Calendar.MONTH))+"-"+Integer.toString(cal.get(Calendar.DATE))+"-"+Integer.toString(cal.get(Calendar.YEAR));

    }
    public String getArrival() {
        return arrival;
    }
    public void setArrival(int YEAR, int MONTH, int DATE) {
        cal.set(YEAR, MONTH, DATE);
        arrival = Integer.toString(cal.get(Calendar.MONTH))+"-"+Integer.toString(cal.get(Calendar.DATE))+"-"+Integer.toString(cal.get(Calendar.YEAR));
    }

    abstract void isDomestic ();


}