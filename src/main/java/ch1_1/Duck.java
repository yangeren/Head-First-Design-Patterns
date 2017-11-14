package ch1_1;

public abstract class Duck {

    Flyact flyact;
    Yealact yealact;
    FlyBeHavior flyBeHavior;

    public void swim() {
        System.out.println("Base Duck swim");
    }

    public void display() {
        System.out.println("Base Duck display");
    }

    void canfly() {
        flyact.fly();
    }

    void canyeal() {
        yealact.yeal();
    }

    void robotcanfly() {
        flyBeHavior.flybehavior();
    }

}
