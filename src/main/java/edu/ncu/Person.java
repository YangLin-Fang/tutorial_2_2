package edu.ncu;

public class Person {
    String name;
    float weight;
    float height;

    public float bmi(){
        return weight/(height*height);
    }
    public void hello(){
        System.out.println("Hello Java");
    }
}
