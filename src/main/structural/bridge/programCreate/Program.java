package main.structural.bridge.programCreate;

public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer=developer;
    }

    public abstract void developProgram();
}
