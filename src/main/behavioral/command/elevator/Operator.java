package main.behavioral.command.elevator;

public class Operator {
    Command up;
    Command down;
    Command stop;

    public Operator(Command up, Command down, Command stop) {
        this.up = up;
        this.down = down;
        this.stop = stop;
    }

    public void elevatorUp() {
        up.execute();
    }

    public void elevatorDown() {
        down.execute();
    }

    public void elevatorStop() {
        stop.execute();
    }
}
