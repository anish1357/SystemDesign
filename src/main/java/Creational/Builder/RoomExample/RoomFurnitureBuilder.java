package Creational.Builder.RoomExample;

import Creational.Builder.RoomExample.Builder;
import Creational.Builder.RoomExample.RoomFurniture;

public class RoomFurnitureBuilder implements Builder {

    private boolean closet;
    private boolean table;
    private boolean bed;
    private boolean mattress;
    private boolean mirror;


    @Override
    public RoomFurnitureBuilder setMirror(boolean v) {
        this.mirror = v;
        return this;
    }

    @Override
    public RoomFurnitureBuilder setCloset(boolean v) {
        this.closet = v;
        return this;
    }

    @Override
    public RoomFurnitureBuilder setBed(boolean v) {
        this.bed = v;
        return this;
    }

    @Override
    public RoomFurnitureBuilder setMattress(boolean v) {
        this.mattress = v;
        return this;
    }

    @Override
    public RoomFurnitureBuilder setTable(boolean v) {
        this.table = v;
        return this;
    }
    
    public RoomFurniture build(){
        return new RoomFurniture(bed,mattress,closet,table,mirror);
    }
}
