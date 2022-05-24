package edu.ncu;

public class FinanceReport implements Report{

    @Override
    public void load() {
        System.out.println("\tFinance loading data");
    }

    @Override
    public void print() {
        System.out.println("\tFinance printing");
    }
}
