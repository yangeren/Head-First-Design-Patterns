package ch1_1;

public class RobotDuck extends Duck {
    public RobotDuck() {
        flyBeHavior = new RobotCantFly();
    }

}
