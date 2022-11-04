package main.creational.abstractFactory.clothes.winter;

import main.creational.abstractFactory.clothes.Jacket;

public class Alaska implements Jacket {
    @Override
    public void info() {
        System.out.println("\"Alaska\" if very warm");
    }
}
