package main.behavioral.strategy.truck;

public class Empty implements Condition{
    @Override
    public void justDoIt() {
        System.out.println("Truck is Empty.");
    }
}
