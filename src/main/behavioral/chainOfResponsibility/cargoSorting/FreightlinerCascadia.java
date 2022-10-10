package main.behavioral.chainOfResponsibility.cargoSorting;

public class FreightlinerCascadia extends Car{
    public FreightlinerCascadia(int loadCapacity) {
        super(loadCapacity);
    }

    @Override
    public void depart(int load) {
        System.out.println("Cascadia is leaving. Cargo weight "+load);
    }
}
