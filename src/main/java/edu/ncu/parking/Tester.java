package edu.ncu.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        //extracted();
        Instant instant = Instant.now();
        System.out.println(instant);
        //Local
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(3)));

        LocalDateTime other = LocalDateTime.of(2018,11,23,8,0,59);
        System.out.println(other);
    }

    private static void extracted() {
        Date date = new Date();
        System.out.println(date);
        //  Date 內部使用 long 長整數 1970/1/1 00:00:00 至今的毫秒數
//        System.out.println("Time : " + date.getTime());
//        System.out.println("Time : " + date.getTime());
//        System.out.println("Time : " + date.getTime());
//        System.out.println("Time : " + date.getTime());
//        System.out.println("Time : " + date.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String s = "11/25/2022 08:00:00";
        try {
            Date other = sdf.parse(s);
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,3);
        System.out.println(calendar.getTime());
        calendar.add(calendar.DAY_OF_YEAR,3);
        System.out.println(calendar.getTime());
    }
}
