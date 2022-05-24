package edu.ncu.student;

public class GraduateStudent extends Student {
    int thesis;
    static int pass = 70;
    public GraduateStudent(String name, int english, int math, int thesis) {
        super(name, english, math);
        this.thesis = thesis;
    }

    @Override
    public void print() {
        float average = getAverage();
        System.out.println(name + "\tenglish:" + english +
                "\tmath:" + math +
                "\tthesis:" + thesis +
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
    }
}
