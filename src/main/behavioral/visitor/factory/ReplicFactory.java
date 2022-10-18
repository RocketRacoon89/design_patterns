package main.behavioral.visitor.factory;

public class ReplicFactory implements Factory{
    @Override
    public void create(Reliability reliability) {
        System.out.println("Poor reliability");
    }

    @Override
    public void create(Appearance appearance) {
        System.out.println("Poor appearance");
    }

    @Override
    public void create(Durability durability) {
        System.out.println("Poor durability");
    }
}
