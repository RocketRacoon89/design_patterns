package main.behavioral.state.truck;

public class Truck {
    Condition condition;

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public void justDoIt() {
        condition.justDoIt();
    }

    public void changeCondition() {
        if(condition instanceof Empty) {
            setCondition(new Loading());
        }else if(condition instanceof Loading) {
            setCondition(new MoveToUnload());
        }else if(condition instanceof MoveToUnload) {
            setCondition(new Unload());
        }else if(condition instanceof Unload) {
            setCondition(new Empty());
        }
    }
}
