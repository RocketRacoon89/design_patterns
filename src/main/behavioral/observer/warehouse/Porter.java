package main.behavioral.observer.warehouse;

import java.util.List;

public class Porter implements Observer {
    String name;

    public Porter(String name) {
        this.name = name;
    }

    @Override
    public void loadEvent(List<String> cargo) {
        System.out.println(name+" cargo "+cargo+" for transportation is waiting.");
    }
}
