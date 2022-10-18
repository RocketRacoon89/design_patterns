package main.behavioral.strategy.truck;

public class Truck {
    Condition condition;

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public void execCondition() {
        condition.justDoIt();
    }
}
