package main.behavioral.state.truck;

public class Empty implements Condition{
    @Override
    public void justDoIt() {
        System.out.println("Truck is empty.");
    }
}
