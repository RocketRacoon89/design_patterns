package main.behavioral.strategy.truck;

public class Loading implements Condition{
    @Override
    public void justDoIt() {
        System.out.println("The truck is loading.");
    }
}
