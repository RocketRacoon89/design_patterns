package main.creational.factoryMethod.car;

public class Program {
    public static void main(String[] args) {
        CarFactory carFactory = createFCar("Pickup");
        Car car = carFactory.createCar();
        car.infoCar();

    }

    static CarFactory createFCar(String car) {
        if(car.equalsIgnoreCase("Sedan")) {
            return new SedanFactory();
        }
        else if(car.equalsIgnoreCase("Pickup")) {
            return new PickupFactory();
        }
        else if (car.equalsIgnoreCase("Truck")) {
            return new TruckFactory();
        }
        else {
            throw new RuntimeException(car+" is missing!!!");
        }
    }

}
