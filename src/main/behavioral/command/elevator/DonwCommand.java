package main.behavioral.command.elevator;

public class DonwCommand implements Command{
    Elevator elevator;

    public DonwCommand(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void execute() {
        elevator.down();
    }
}
