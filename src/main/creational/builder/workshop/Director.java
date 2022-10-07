package main.creational.builder.workshop;

public class Director {
    WorkshopBuilder workshopBuilder;

    public void setWorkshopBuilder(WorkshopBuilder workshopBuilder) {
        this.workshopBuilder = workshopBuilder;
    }

    Workshop buildWorkshop() {
        workshopBuilder.createWorkshop();
        workshopBuilder.buildSpecialization();
        workshopBuilder.buildEquipment();

        Workshop workshop = workshopBuilder.getWorkshop();
        return workshop;
    }
}
