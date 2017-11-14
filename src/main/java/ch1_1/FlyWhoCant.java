package ch1_1;

public class FlyWhoCant implements Flyact {
    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
