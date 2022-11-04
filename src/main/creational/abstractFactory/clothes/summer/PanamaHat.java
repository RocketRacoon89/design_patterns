package main.creational.abstractFactory.clothes.summer;

import main.creational.abstractFactory.clothes.Headdress;

public class PanamaHat implements Headdress {
    @Override
    public void info() {
        System.out.println("Panama protects from the sun");
    }
}
