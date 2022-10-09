package main.structural.proxy.truck;

public class ProxyTruck implements processTruck{
    private RealTruck truck;

    @Override
    public void run() {
        if(truck==null) {
            truck = new RealTruck();
        }
        truck.run();
    }
}
