package com.f22pkj31.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateUtil {

    private static SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM");
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public static Date[] getMouths(int mouth){
        int monthValue = LocalDate.now().getMonthValue();
        int year = LocalDate.now().getYear();
        if (mouth > monthValue) {
            year--;
        }
        String startTimeString = year + "-" + mouth;
        String endTimeString = null;
        if (mouth == 12) {
            endTimeString = (year + 1) + "-" + 1;
        } else {
            endTimeString = year + "-" + (mouth + 1);
        }
        Date startTime = null;
        Date endTime = null;
        try {
            startTime = format1.parse(startTimeString);
            endTime = format1.parse(endTimeString);
            return new Date[]{startTime,endTime};
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
