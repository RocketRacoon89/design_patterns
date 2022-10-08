package main.structural.decorator.electrician;

public class Electrician_2_cat extends ElectricianDecorator{
    public Electrician_2_cat(Electrician electrician) {
        super(electrician);
    }

    public String doWork2Cat() {
        return "Changes the switch.";
    }

    @Override
    public String doWork() {
        return super.doWork()+" "+doWork2Cat();
    }
}
