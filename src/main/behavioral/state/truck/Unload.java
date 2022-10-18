package main.behavioral.state.truck;

public class Unload implements Condition{
    @Override
    public void justDoIt() {
        System.out.println("The Truck is being unloaded.");
    }
}
