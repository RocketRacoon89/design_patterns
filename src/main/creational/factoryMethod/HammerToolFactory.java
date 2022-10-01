package main.creational.factoryMethod;

public class HammerToolFactory implements ToolFactory{
    @Override
    public Tool createTool() {
        return new Hammer();
    }
}
