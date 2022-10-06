package main.behavioral.visitor.project;

public class Database implements ProjectElement{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
