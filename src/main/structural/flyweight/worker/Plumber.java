package main.structural.flyweight.worker;

public class Plumber implements Worker{
    @Override
    public void doWork() {
        System.out.println("Plumber makes plumbing.");
    }

    @Override
    public String toString() {
        return "Plumber";
    }
}
