package edu.ncu.student;

public class Student {
    /*Property*/
    String id;
    String name;
    float english;
    float math;
    /*Construe*/
    /*SHORTCUT : [alt + ins]*/
    public Student(){}
    public Student(String name, float english, float math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }
    /*Method*/
    public void print(){
        System.out.println(name + "\tenglish:" + english + "\tmath:" + math + "\taverage:" + ((english+math)/2));
    }
    public float highest(){
//        float max = (english>math)? english:math;
        /*if(english>math){
            max=english;
        }else {
            max=math;
        }*/
        return (english > math) ? english:math;
    }
}
