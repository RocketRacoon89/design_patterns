package main.structural.bridge.car;

public class ProgramRunner {
    public static void main(String[] args) {
        Maker maker1 = new Bugatti(new SportsCar());
        maker1.work();

        Maker maker2 = new Volvo(new Truck());
        maker2.work();
    }
}
