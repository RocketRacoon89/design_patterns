package main.behavioral.interpreter.myExpression;

public class Car {
    int price;
    int year;

    public Car(int price, int year) {
        this.price = price;
        this.year = year;
    }

    public boolean check(int checkPrice, int checkYear){
        if(price<checkPrice && year>checkYear) {
            return true;
        } else
            return false;
    }
}