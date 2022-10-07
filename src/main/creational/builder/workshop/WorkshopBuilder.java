package main.creational.builder.workshop;

public abstract class WorkshopBuilder {
    Workshop workshop;

    void createWorkshop() {
        workshop = new Workshop();
    }

    abstract void buildSpecialization();
    abstract void buildEquipment();

    Workshop getWorkshop() {
        return workshop;
    }
}
