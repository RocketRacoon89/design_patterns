package main.creational.factoryMethod;

public class ScrewdriverToolFactory implements ToolFactory{
    @Override
    public Tool createTool() {
        return new Screwdriver();
    }
}
