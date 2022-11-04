package main.creational.abstractFactory.clothes.winter;

import main.creational.abstractFactory.clothes.Headdress;
import main.creational.abstractFactory.clothes.Jacket;
import main.creational.abstractFactory.clothes.SetFactory;
import main.creational.abstractFactory.clothes.Shoes;

public class SetWinterFactory implements SetFactory {
    @Override
    public Headdress getHeaddress() {
        return new Ushanka();
    }

    @Override
    public Jacket getJacket() {
        return new Alaska();
    }

    @Override
    public Shoes getShoes() {
        return new Ugg();
    }
}
