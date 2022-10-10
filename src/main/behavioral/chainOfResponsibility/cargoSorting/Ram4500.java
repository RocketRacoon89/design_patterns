package main.behavioral.chainOfResponsibility.cargoSorting;

public class Ram4500 extends Car{

    public Ram4500(int loadCapacity) {
        super(loadCapacity);
    }

    @Override
    public void depart(int load) {
        System.out.println("Ram4500 is leaving. Cargo weight "+load);
    }
}
