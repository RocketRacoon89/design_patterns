package main.structural.flyweight.worker;

public class Electrician implements Worker{
    @Override
    public void doWork() {
        System.out.println("Electrician makes electrics.");
    }

    @Override
    public String toString() {
        return "Electrician";
    }
}
