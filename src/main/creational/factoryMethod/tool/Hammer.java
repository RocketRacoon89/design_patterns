package main.creational.factoryMethod.tool;

public class Hammer implements Tool{
    @Override
    public void work() {
        System.out.println("Hammer hammers nails");
    }
}
