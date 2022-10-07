package main.creational.builder.workshop;

public class BuildWorkshopRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setWorkshopBuilder(new ElectricalWorkshopBuilder());
        Workshop workshop = director.buildWorkshop();
        System.out.println(workshop);
    }
}
