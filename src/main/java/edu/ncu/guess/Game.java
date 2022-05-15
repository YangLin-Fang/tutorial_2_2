package edu.ncu.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        System.out.println("Secret Number:" + secret);
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while(number != secret){
            System.out.println("Please enter a number :");
            number = scanner.nextInt();
            if(number > secret){
                System.out.println("Lower");
            }else if(number < secret){
                System.out.println("Higher");
            }else {
                System.out.println("Great, the number is:" + number);
            }
        }
    }
}
