package main.behavioral.strategy.truck;

public class Unloading implements Condition{
    @Override
    public void justDoIt() {
        System.out.println("The truck is being unloaded.");
    }
}
