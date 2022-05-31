package edu.ncu.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter year: (" + year + ")");
            String yearString = bufferedReader.readLine();
            year = (yearString.length() > 0)? Integer.parseInt(yearString) : year;
//            if (yearString.length() > 0) {
//                year = Integer.parseInt(yearString);
//            }
            System.out.println(year);
            System.out.println("Please enter month: (" + month + ")");
            String monthString = bufferedReader.readLine();
            month = (monthString.length() > 0)? Integer.parseInt(monthString) : month;
//            if (monthString.length() > 0) {
//                month = Integer.parseInt(monthString);
//            }
            System.out.println(month);
            System.out.println("Please enter day: (" + day + ")");
            String dayString = bufferedReader.readLine();
            day = (dayString.length() > 0)? Integer.parseInt(dayString) : day;
//            if (yearString.length() > 0) {
//                day = Integer.parseInt(dayString);
//            }
            System.out.println(day);
        } catch (IOException e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }
    }
}
