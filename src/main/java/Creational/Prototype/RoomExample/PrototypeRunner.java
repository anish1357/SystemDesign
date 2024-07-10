package Creational.Prototype.RoomExample;

public class PrototypeRunner {
    public static void main(String[] args) {
        Room room1 = new Bedroom(10, 10, 10);
        System.out.println(room1);
        Room roomCopy = room1.getClone();
        System.out.println(roomCopy);
    }
}
