package edu.ncu.guess;

import java.util.Random;
import java.util.Scanner;

public class Gamefor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number;
        int secret = random.nextInt(10) + 1;
        int gameover = 5;
        System.out.println("Secret Number is :" + secret);
        for(int i=1; i<=gameover; i++) {
            System.out.println("Please enter a number : (" + i + "/" + gameover + ")");
            number = scanner.nextInt();
            System.out.println("第" + i + "次");
            if (number > secret) {
                System.out.println("Lower");
            } else if (number < secret) {
                System.out.println("Higher");
            } else {
                System.out.println("Great, the number is:" + number);
                break;
            }
            if(i >= gameover){
                System.out.println("Game Over");
                break;
            }
        }
    }
}
