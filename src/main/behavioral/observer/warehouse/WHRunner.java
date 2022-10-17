package main.behavioral.observer.warehouse;

public class WHRunner {
    public static void main(String[] args) {
        PlaceOfUnloading unloading = new PlaceOfUnloading();

        unloading.addCargo("Box 30x30");
        unloading.addCargo("Box 50x50");
        unloading.addCargo("Bucket");

        Observer observer1 = new Porter("Ivan");
        Observer observer2 = new Porter("Andrew");

        unloading.addObserver(observer1);
        unloading.addObserver(observer2);

        unloading.addCargo("Big box 100x100");

        unloading.removeCargo("Box 30x30");
    }
}
