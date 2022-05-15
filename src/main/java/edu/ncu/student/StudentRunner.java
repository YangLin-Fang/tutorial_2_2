package edu.ncu.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student's name:");
        String name = scanner.next();
        System.out.println("Please enter student's english:");
        float english = scanner.nextFloat();
        System.out.println("Please enter student's math:");
        float math = scanner.nextFloat();
        Student stu = new Student(name,english,math);
        stu.print();
    }
}