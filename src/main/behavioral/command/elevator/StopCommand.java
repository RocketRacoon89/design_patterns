package main.behavioral.command.elevator;

public class StopCommand implements Command{
    Elevator elevator;

    public StopCommand(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void execute() {
        elevator.stop();
    }
}
