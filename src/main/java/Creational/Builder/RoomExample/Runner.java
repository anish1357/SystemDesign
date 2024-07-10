package Creational.Builder.RoomExample;

public class Runner {
    public static void main(String[] args) {
        RoomFurniture room1 = new RoomFurnitureBuilder().setBed(true).setMattress(true).build();
        System.out.println(room1.toString());
        RoomFurniture room2 = new RoomFurnitureBuilder().setCloset(true).setMirror(true).setBed(true).setMattress(true).build();
        System.out.println(room2.toString());

    }
}
