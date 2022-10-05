package main.structural.bridge.programCreate;

public class StockExchange extends Program{
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in progress");
        developer.writeCode();
    }
}
