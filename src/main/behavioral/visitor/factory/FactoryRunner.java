package main.behavioral.visitor.factory;

public class FactoryRunner {
    public static void main(String[] args) {
        FactoryClass factory = new FactoryClass();

        ReplicFactory replicFactory = new ReplicFactory();
        OriginalFactory originalFactory = new OriginalFactory();

        factory.atrCreate(replicFactory);

        System.out.println("+++++++++++++++++++++++++++++");

        factory.atrCreate(originalFactory);
    }
}
