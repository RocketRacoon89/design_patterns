package main.creational.factoryMethod.tool;

public class HammerToolFactory implements ToolFactory{
    @Override
    public Tool createTool() {
        return new Hammer();
    }
}
