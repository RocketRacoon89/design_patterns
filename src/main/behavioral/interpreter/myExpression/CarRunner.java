package main.behavioral.interpreter.myExpression;

public class CarRunner {
    public static void main(String[] args) {
        Expression checkExp = getCheck();

        System.out.println(checkExp.interpret(6500, 2006));
    }

    public static Expression getCheck() {
        Car car1 = new Car(5000, 2008);
        Car car2 = new Car(10000, 2012);

        Expression expression1 = new MyTerminal(car1);
        Expression expression2 = new MyTerminal(car2);

        return new Selection(expression1, expression2);

    }
}
