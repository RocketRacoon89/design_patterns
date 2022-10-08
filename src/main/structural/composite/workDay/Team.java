package main.structural.composite.workDay;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Worker> team = new ArrayList<>();

    public void addWorker(Worker worker) {
        team.add(worker);
    }

    public void removeWorker(Worker worker) {
        team.remove(worker);
    }

    public void createWork() {
        System.out.println("Work day has started...");
        for(Worker worker:team) {
            worker.doWork();
        }
    }
}
