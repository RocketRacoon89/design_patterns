package main.creational.abstractFactory.clothes.summer;

import main.creational.abstractFactory.clothes.Headdress;
import main.creational.abstractFactory.clothes.Jacket;
import main.creational.abstractFactory.clothes.SetFactory;
import main.creational.abstractFactory.clothes.Shoes;

public class SetSummerFactory implements SetFactory {
    @Override
    public Headdress getHeaddress() {
        return new PanamaHat();
    }

    @Override
    public Jacket getJacket() {
        return new TShirt();
    }

    @Override
    public Shoes getShoes() {
        return new Sneakers();
    }
}
