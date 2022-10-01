package main.creational.factoryMethod;

public class WrenchToolFactory implements ToolFactory{
    @Override
    public Tool createTool() {
        return new Wrench();
    }
}
