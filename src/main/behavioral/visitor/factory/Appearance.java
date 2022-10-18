package main.behavioral.visitor.factory;

public class Appearance implements Attribute {

    @Override
    public void atrCreate(Factory factory) {
        factory.create(this);
    }
}
