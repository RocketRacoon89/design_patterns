package main.behavioral.interpreter.myExpression;

public class MyTerminal implements Expression{
    Car car;

    public MyTerminal(Car car) {
        this.car = car;
    }


    @Override
    public boolean interpret(int p, int y) {
        if(car.check(p, y)) {
            return true;
        } else {
            return false;
        }
    }
}