package main.creational.factoryMethod;

public class Screwdriver implements Tool{
    @Override
    public void work() {
        System.out.println("The Screwdriver tightens the screw...");
    }
}
