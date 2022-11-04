package main.creational.abstractFactory.clothes.winter;

import main.creational.abstractFactory.clothes.Shoes;

public class Ugg implements Shoes {
    @Override
    public void info() {
        System.out.println("Ugg is very warm");
    }
}
