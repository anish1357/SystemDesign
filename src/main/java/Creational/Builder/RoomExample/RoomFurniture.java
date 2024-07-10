package Creational.Builder.RoomExample;

public class RoomFurniture {
    public boolean bed;
    public boolean mattress;
    public boolean closet;
    public boolean table;
    public boolean mirror;

    public RoomFurniture(boolean bed, boolean mattress, boolean closet, boolean table, boolean mirror) {
        this.bed = bed;
        this.mattress = mattress;
        this.closet = closet;
        this.table = table;
        this.mirror = mirror;
    }

    @Override
    public String toString() {
        return "RoomFurniture{" +
                "bed=" + bed +
                ", mattress=" + mattress +
                ", closet=" + closet +
                ", table=" + table +
                ", mirror=" + mirror +
                '}';
    }
}
