package Structural.Flyweight;

public class HumanRobot implements Robot{
    public String type;
    public String color;

    public HumanRobot(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Moved to cordinates " + x + "," + y);
    }
}
