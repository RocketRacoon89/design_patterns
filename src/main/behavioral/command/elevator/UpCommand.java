package main.behavioral.command.elevator;

public class UpCommand implements Command{
    Elevator elevator;

    public UpCommand(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void execute() {
        elevator.up();
    }
}
