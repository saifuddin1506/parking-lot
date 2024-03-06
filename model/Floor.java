package ParkingLot.model;

import java.util.List;

public class Floor {
    private int floorNum;
    private List<Slots> slots;
    public Floor(){
        
    }
    public Floor(int floorNum, List<Slots> slots){
         this.floorNum = floorNum;
         this. slots = slots;
    }
    public List<Slots> getSlots(){
        return this.slots;
    }
    public int getFloorNum(){
        return this.floorNum;
    }
}
