package main.structural.composite.workDay;

public class Electrician implements Worker{
    @Override
    public void doWork() {
        System.out.println("Electrician does electrics...");
    }
}
