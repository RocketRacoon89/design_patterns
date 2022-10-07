package main.creational.builder.workshop;

public class ElectricalWorkshopBuilder extends WorkshopBuilder{
    @Override
    void buildSpecialization() {
        workshop.setSpecialization("Electrical Workshop");
    }

    @Override
    void buildEquipment() {
        workshop.setEquipment(Equipment.ElectricalEquipment);
    }
}
