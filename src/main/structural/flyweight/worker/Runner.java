package main.structural.flyweight.worker;

public class Runner {
    public static void main(String[] args) {
        WorkerFactory factory = new WorkerFactory();
        factory.viewTeam();
        factory.getWorkerBySpecialty("electrician");
        factory.getWorkerBySpecialty("plumber");
        factory.viewTeam();
    }
}
