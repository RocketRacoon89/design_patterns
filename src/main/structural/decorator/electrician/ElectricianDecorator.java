package main.structural.decorator.electrician;

public class ElectricianDecorator implements Electrician{

    Electrician electrician;

    public ElectricianDecorator(Electrician electrician) {
        this.electrician = electrician;
    }

    @Override
    public String doWork() {
        return electrician.doWork();
    }
}
