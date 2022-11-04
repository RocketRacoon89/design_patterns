package main.creational.abstractFactory.clothes;

import main.creational.abstractFactory.clothes.summer.SetSummerFactory;
import main.creational.abstractFactory.clothes.winter.SetWinterFactory;

public class Program {
    public static void main(String[] args) {
        SetFactory factory1 = getClothes("summer");
        factory1.getHeaddress().info();
        factory1.getJacket().info();
        factory1.getShoes().info();
    }

    static SetFactory getClothes(String season) {
        if(season.equalsIgnoreCase("winter")) {
            return new SetWinterFactory();
        } else if(season.equalsIgnoreCase("summer")) {
            return new SetSummerFactory();
        }
        else
            throw new RuntimeException("Only winter or summer!");
    }
}
