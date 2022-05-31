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
        int year = calendar.get(calendar.YEAR);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter year: (" + year + ")");
            String yearString = bufferedReader.readLine();
            if (yearString.length() > 0) {
                year = Integer.parseInt(yearString);
            }
            System.out.println(year);
        } catch (IOException e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }
    }
}
