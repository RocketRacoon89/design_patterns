package main.behavioral.visitor.factory;

public class OriginalFactory implements Factory{
    @Override
    public void create(Reliability reliability) {
        System.out.println("Excellent reliability");
    }

    @Override
    public void create(Appearance appearance) {
        System.out.println("Excellent appearance");
    }

    @Override
    public void create(Durability durability) {
        System.out.println("Excellent durability");
    }
}
