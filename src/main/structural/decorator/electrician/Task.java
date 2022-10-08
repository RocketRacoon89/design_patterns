package main.structural.decorator.electrician;

public class Task {
    public static void main(String[] args) {
        Electrician electrician = new Electrician_3_cat(new Electrician_2_cat(new Electrician_1_cat()));
        System.out.println(electrician.doWork());
    }

}
