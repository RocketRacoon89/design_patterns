package main.behavioral.visitor.factory;

public class Durability implements Attribute{
    @Override
    public void atrCreate(Factory factory) {
        factory.create(this);
    }
}
