package main.behavioral.observer.warehouse;

import java.util.ArrayList;
import java.util.List;

public class PlaceOfUnloading implements Observed{
    List<String> cargo = new ArrayList<>();
    List<Observer> porters = new ArrayList<>();

    public void addCargo(String cargo) {
        this.cargo.add(cargo);
        notifyObserver();
    }

    public void removeCargo(String cargo) {
        this.cargo.remove(cargo);
        notifyObserver();
    }


    @Override
    public void addObserver(Observer observer) {
        this.porters.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.porters.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:porters) {
            observer.loadEvent(cargo);
        }
    }
}
