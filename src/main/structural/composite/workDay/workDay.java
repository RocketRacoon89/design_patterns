package main.structural.composite.workDay;

public class workDay {
    public static void main(String[] args) {
        Team team = new Team();

        Worker worker1 = new Electrician();
        Worker worker2 = new Mechanic();
        Worker worker3 = new Mechanic();

        team.addWorker(worker1);
        team.addWorker(worker2);
        team.addWorker(worker3);

        team.createWork();
    }
}
