package main.behavioral.state.truck;

public class MoveToUnload implements Condition{
    @Override
    public void justDoIt() {
        System.out.println("Truck is going to unload.");
    }
}
