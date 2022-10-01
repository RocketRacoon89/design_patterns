package main.creational.factoryMethod;

public class Wrench implements Tool{
    @Override
    public void work() {
        System.out.println("The wrench turns the bolts");
    }
}
