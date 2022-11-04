package main.creational.abstractFactory.clothes.summer;

import main.creational.abstractFactory.clothes.Shoes;

public class Sneakers implements Shoes {
    @Override
    public void info() {
        System.out.println("comfortable sneakers");
    }
}
