package Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

    public static Map<String,Robot> map = new HashMap<>();

    public static Robot getRobot(String robotType){
        if(map.containsKey(robotType)){
            map.get(robotType);
        }
        if(robotType.equals("Human")){
            Robot robot = new HumanRobot("BLUE","Human");
            map.put("Human",robot);
            return robot;
        }else {
            Robot robot = new HumanRobot("BLUE","Animal");
            map.put("Animal",robot);
            return robot;
        }
    }
}
