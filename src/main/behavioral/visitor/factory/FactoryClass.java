package main.behavioral.visitor.factory;

public class FactoryClass implements Attribute{

    Attribute[] attributes;

    public FactoryClass() {
        this.attributes = new Attribute[] {
                new Appearance(),
                new Reliability(),
                new Durability()
        };
    }

    @Override
    public void atrCreate(Factory factory) {
        for(Attribute attribute:attributes) {
            attribute.atrCreate(factory);
        }
    }
}
