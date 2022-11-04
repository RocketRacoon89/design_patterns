package main.creational.abstractFactory.clothes.winter;

import main.creational.abstractFactory.clothes.Headdress;

public class Ushanka implements Headdress {
    @Override
    public void info() {
        System.out.println("The fur hat is very warm");
    }
}
