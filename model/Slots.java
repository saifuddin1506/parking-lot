package ParkingLot.model;

public class Slots {
    
    private String slotType;
    private int slotNum;
    private boolean isAvailable;
    public Slots(){

    }
    public Slots(int slotNum){
        this.isAvailable = true;
        this.slotNum = slotNum;
        if(slotNum<=1){
            this.slotType= "TRUCK";
        } else if(slotNum<=3){
            this.slotType ="BIKE";
        } else {
            this.slotType = "CAR";
        }
    }

    public String getSlotType(){
    return this.slotType;
    }
    public boolean getIsAvailable(){
        return this.isAvailable;
    }
}
