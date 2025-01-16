package Structural.Flyweight;

public class Client {
    public static void main(String[] args) {
       Robot robot = RobotFactory.getRobot("Human");
       robot.display(10,15);
    }
}
