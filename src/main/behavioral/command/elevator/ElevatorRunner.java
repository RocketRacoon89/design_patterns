package main.behavioral.command.elevator;

public class ElevatorRunner {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        Operator operator = new Operator(
                new UpCommand(elevator),
                new DonwCommand(elevator),
                new StopCommand(elevator)
        );

        operator.elevatorUp();
        operator.elevatorStop();
        operator.elevatorDown();
    }
}
