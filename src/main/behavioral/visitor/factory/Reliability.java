package main.behavioral.visitor.factory;

public class Reliability implements Attribute{
    @Override
    public void atrCreate(Factory factory) {
        factory.create(this);
    }
}
