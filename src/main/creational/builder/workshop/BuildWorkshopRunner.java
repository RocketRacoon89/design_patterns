package main.creational.builder.workshop;

public class BuildWorkshopRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setWorkshopBuilder(new ElectricalWorkshopBuilder());

        Workshop workshop = director.buildWorkshop();
        System.out.println(workshop);

        System.out.println("=================================================");
        Director director1 = new Director();
        director1.setWorkshopBuilder(new MechanicalWorkshopBuilder());

        Workshop workshop1 = director1.buildWorkshop();
        System.out.println(workshop1);
    }
}
