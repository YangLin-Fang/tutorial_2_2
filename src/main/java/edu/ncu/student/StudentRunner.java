package edu.ncu.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student.pass = 50;
        Student stu1 = new Student("Ruby", 97, 10);
        Student stu2 = new Student("Teddy", 60, 40);
        Student stu3 = new Student("Roby", 30, 50);
        GraduateStudent stu4 = new GraduateStudent("Leo", 70,69,70);

        stu1.print();
        stu2.print();
        stu3.print();
        stu4.print();

    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student's name:");
        String name = scanner.next();
        System.out.println("Please enter student's english:");
        float english = scanner.nextFloat();
        System.out.println("Please enter student's math:");
        float math = scanner.nextFloat();
        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println("High score: " + stu.highest());
    }
}