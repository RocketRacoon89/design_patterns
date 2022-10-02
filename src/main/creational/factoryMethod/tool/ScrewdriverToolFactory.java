package main.creational.factoryMethod.tool;

public class ScrewdriverToolFactory implements ToolFactory{
    @Override
    public Tool createTool() {
        return new Screwdriver();
    }
}
