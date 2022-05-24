package edu.ncu;

public class HealthReport implements Report{
    @Override
    public void load() {
        System.out.println("\tHealth loading data");
    }

    @Override
    public void print() {
        System.out.println("\tHealth printing");
    }
}
