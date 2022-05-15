package edu.ncu;

public class Person {
    /*Field/Property*/
    String name;
    float weight;
    float height;

    /*Constructor*/
    public Person(){}

    public Person(float weight, float height){
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, float weight, float height){
        this(weight, height);
        this.name = name;
//        this.weight = weight;
//        this.height = height;
    }
    /*Method*/
    public float bmi(){
        return weight/(height*height);
    }
    public void hello(){
        System.out.println("Hello Java");
    }
}
