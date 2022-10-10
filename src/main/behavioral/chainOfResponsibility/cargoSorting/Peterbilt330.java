package main.behavioral.chainOfResponsibility.cargoSorting;

public class Peterbilt330 extends Car{

    public Peterbilt330(int loadCapacity) {
        super(loadCapacity);
    }

    @Override
    public void depart(int load) {
        System.out.println("Peterbilt330 is leaving. Cargo weight "+load);
    }
}
