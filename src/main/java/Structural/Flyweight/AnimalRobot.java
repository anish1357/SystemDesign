package Structural.Flyweight;

public class AnimalRobot implements Robot{


    String type;
    String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AnimalRobot(String type, String color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("moved to cordinates " + x + "," + y);
    }
}
