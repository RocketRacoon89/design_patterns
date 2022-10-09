package main.structural.flyweight.worker;

import java.util.HashMap;
import java.util.Map;

public class WorkerFactory {
    private static final Map<String, Worker> team = new HashMap<>();

    public Worker getWorkerBySpecialty(String spec) {
        Worker worker = team.get(spec);

        if(worker==null) {
            switch (spec) {
                case ("electrician"):
                    worker = new Electrician();
                    System.out.println("Hiring electrician...");
                    break;
                case ("plumber"):
                    worker = new Plumber();
                    System.out.println("Hiring plumber...");
            }
            team.put(spec,worker);
        }
        return worker;
    }

    public void viewTeam() {
        if(!team.isEmpty()) {
            System.out.println("Our team contains: ");
            for(Map.Entry<String, Worker> w : team.entrySet()) {
                System.out.println(w.getValue());
            }
        } else {
            System.out.println("Team is empty...");
        }
    }
}
