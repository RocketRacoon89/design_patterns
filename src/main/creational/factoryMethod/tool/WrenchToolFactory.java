package main.creational.factoryMethod.tool;

public class WrenchToolFactory implements ToolFactory{
    @Override
    public Tool createTool() {
        return new Wrench();
    }
}
