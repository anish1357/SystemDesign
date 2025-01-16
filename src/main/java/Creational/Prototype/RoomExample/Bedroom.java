package Creational.Prototype.RoomExample;

public class Bedroom implements Room{

    private int height;
    private int width;
    private int length;

    public Bedroom(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public Room getClone() {
        return new Bedroom(height,width,length);
    }

    @Override
    public String






    toString() {
        return "Bedroom{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
