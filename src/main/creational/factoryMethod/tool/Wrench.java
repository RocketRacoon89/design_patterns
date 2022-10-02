package main.creational.factoryMethod.tool;

public class Wrench implements Tool{
    @Override
    public void work() {
        System.out.println("The wrench turns the bolts");
    }
}
