package main.structural.composite.workDay;

public class Mechanic implements Worker{
    @Override
    public void doWork() {
        System.out.println("Mechanic does mechanics...");
    }
}
