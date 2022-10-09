package main.structural.proxy.truck;

public class Runner {
    public static void main(String[] args) {
        processTruck truck = new ProxyTruck();
        truck.run();
    }
}
