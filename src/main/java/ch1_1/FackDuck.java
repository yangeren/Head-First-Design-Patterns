package ch1_1;

public class FackDuck extends Duck {
    public FackDuck() {
        flyact = new FlyWhoCan();
        yealact = new YealWhoCant();
    }

    @Override
    public void swim() {
        System.out.println("FackDuck swim");
    }

    @Override
    public void display() {
        System.out.println("FackDuck display");
    }
}
