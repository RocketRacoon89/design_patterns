package main.behavioral.visitor.factory;

public interface Factory {
    public void create(Reliability reliability);

    public void create(Appearance appearance);

    public void create(Durability durability);
}
