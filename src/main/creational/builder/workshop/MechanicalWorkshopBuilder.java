package main.creational.builder.workshop;

public class MechanicalWorkshopBuilder extends WorkshopBuilder{
    @Override
    void buildSpecialization() {
        workshop.setSpecialization("Mechanical Workshop");
    }

    @Override
    void buildEquipment() {
        workshop.setEquipment(Equipment.MechanicalEquipment);
    }
}
