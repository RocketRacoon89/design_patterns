package main.behavioral.interpreter.myExpression;

public class Selection implements Expression{
    private Expression expression1;
    private Expression expression2;

    public Selection(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(int p, int y) {
        return expression1.interpret(p, y) || expression2.interpret(p, y);
    }
}