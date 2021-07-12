package Utilities;

import org.apache.log4j.Logger;

import java.time.LocalDate;

public class TimeHandler {

    final Logger logger = Log.getLogData(Log.class.getName());

    public static String TravelDateOne(int startDatesCount) {
            LocalDate futureDate1 = LocalDate.now().plusDays(Long.parseLong(String.valueOf(startDatesCount)));
            System.out.println("Check In Date is : " + futureDate1);
            String startDate = futureDate1.toString();
            return startDate;
    }

    public static String TravelDateTwo(int endDatesCount) {
        LocalDate futureDate2 = LocalDate.now().plusDays(Long.parseLong(String.valueOf(endDatesCount)));
        System.out.println("Check Out Date is : " + futureDate2);
        String endDate = futureDate2.toString();
        return endDate;
    }
}