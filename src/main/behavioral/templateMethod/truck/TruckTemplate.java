package main.behavioral.templateMethod.truck;

public abstract class TruckTemplate {
    public void showAction(){
        System.out.println("The Truck is going on...");
        showDAction();
    }

    public abstract void showDAction();
}
