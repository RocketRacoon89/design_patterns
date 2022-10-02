package main.creational.factoryMethod.tool;

public class Program {
    public static void main(String[] args) {
        ToolFactory toolFactory = createToolByType("wrench");
        Tool tool = toolFactory.createTool();

        tool.work();

    }

    static ToolFactory createToolByType(String type) {
        if(type.equalsIgnoreCase("Hammer")) {
            return new HammerToolFactory();
        } else if(type.equalsIgnoreCase("Screwdriver")) {
            return new ScrewdriverToolFactory();
        } else if(type.equalsIgnoreCase("Wrench")) {
            return new WrenchToolFactory();
        } else {
            throw new RuntimeException(type +" - There is no such tool!");
        }

    }
}
