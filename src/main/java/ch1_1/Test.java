package ch1_1;

public class Test {
    public static void main(String args[]) {
        Duck duck = new FackDuck();
        duck.canfly();
        duck.canyeal();
        duck.swim();
        duck.display();

        Duck robotduck = new RobotDuck();
        robotduck.robotcanfly();
        robotduck.canfly();
    }
}
