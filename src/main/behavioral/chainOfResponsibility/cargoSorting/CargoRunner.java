package main.behavioral.chainOfResponsibility.cargoSorting;

public class CargoRunner {
    public static void main(String[] args) {
        Car ram4500 = new Ram4500(classTruck.CLASS_1);
        Car peter = new Peterbilt330(classTruck.CLASS_2);
        Car cascadia = new FreightlinerCascadia(classTruck.CLASS_3);

        ram4500.setNextCar(peter);
        peter.setNextCar(cascadia);

        ram4500.cargoManager(5000);
        ram4500.cargoManager(10000);
        ram4500.cargoManager(14000);

    }
}
