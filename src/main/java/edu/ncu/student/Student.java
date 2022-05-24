package edu.ncu.student;

public class Student {
    /*Property*/
    String id;
    String name;
    float english;
    float math;
    static int pass = 60;

    /*Construe*/
    /*SHORTCUT : [alt + ins]*/
//    public Student() {
//    }

    public Student(String name, float english, float math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    /*Method*/
    public void print() {
        float average = getAverage();
        System.out.println(name + "\tenglish:" + english +
                "\tmath:" + math +
                "\taverage:" + getAverage() +
                "\tPass/Fail:" + ((average >= pass) ? "PASS" : "FAIL"));
        /* ==" ==" =="*/
        //  90 to 100   -> grading is A
        //  80 to 89    -> grading is B
        //  70 to 79    -> grading is C
        //  60 to 69    -> grading is D
        //  59 down     -> grading is F
        char grading = 'F';
        switch ((int) (average / 10)) {
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        //[Case:1]
        /*if(average <=100 && average >= 90){
            System.out.println("\tGrading is:" + "A");
        }else{
            if(average <= 89 && average >= 80){
                System.out.println("\tGrading is:" + "B");
            }else {
                if(average <= 79 && average >= 70){
                    System.out.println("\tGrading is:" + "C");
                }else{
                    if(average <= 69 && average >= 60){
                        System.out.println("\tGrading is:" + "D");
                    }else {
                        System.out.println("\tGrading is:" + "F");
                    }
                }
            }
        }*/
        //[Case:2]
        /*if(average <= 100 && average >= 90){
            System.out.println("A");
        }
        else if(average <= 89 && average >= 80){
            System.out.println("B");
        }
        else if(average <= 79 && average >= 70){
            System.out.println("C");
        }
        else if(average <= 69 && average >= 60){
            System.out.println("D");
        }
        else if(average <= 59){
            System.out.println("F");
        }*/
        //[case:3]
        /*char grading = 'F';
        if(average <= 100 && average >= 90){
            grading = 'A';
        }
        else if(average <= 89 && average >= 80){
            grading = 'B';
        }
        else if(average <= 79 && average >= 70){
            grading = 'C';
        }
        else if(average <= 69 && average >= 60){
            grading = 'D';
        }
        else if(average <= 59){
            grading = 'F';
        }*/
        System.out.println("\tGrading is :" + grading);
        /*if (getAverage() >= 60){
            System.out.println("\tPASS");
        }else {
            System.out.println("\tFAIL");
        }*/
    }

    public float highest() {
//        float max = (english>math)? english:math;
        /*if(english>math){
            max=english;
        }else {
            max=math;
        }*/
        return ((english > math) ? english : math);
    }

    public float getAverage() {
        return (english + math) / 2;
    }
}
