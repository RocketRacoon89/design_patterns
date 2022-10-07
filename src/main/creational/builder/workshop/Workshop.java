package main.creational.builder.workshop;

public class Workshop {
    private String specialization;
    private Equipment equipment;

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "Workshop{" +
                "specialization='" + specialization + '\'' +
                ", equipment=" + equipment +
                '}';
    }
}
