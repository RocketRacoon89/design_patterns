package main.structural.decorator.electrician;

public class Electrician_3_cat extends ElectricianDecorator{
    public Electrician_3_cat(Electrician electrician) {
        super(electrician);
    }

    public String doWork3Cat() {
        return "Changes the electric meter.";
    }

    @Override
    public String doWork() {
        return super.doWork()+" "+doWork3Cat();
    }
}
