package main.creational.abstractFactory.clothes.summer;

import main.creational.abstractFactory.clothes.Jacket;

public class TShirt implements Jacket {
    @Override
    public void info() {
        System.out.println("Simple T-shirt");
    }
}
